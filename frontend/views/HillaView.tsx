import { Grid } from "@hilla/react-components/Grid";
import { GridColumn } from "@hilla/react-components/GridColumn";
import { DatePicker } from "@hilla/react-components/DatePicker";
import {signal} from "@preact/signals-react";
import {useEffect} from "react";
import {ContactService} from "Frontend/generated/endpoints";
import Contact from "Frontend/generated/com/example/application/Contact";
import {Notification} from "@vaadin/notification";

const contacts = signal<Contact[]>([]);

export default function HillaView() {
  useEffect(() => {
    ContactService.getContacts().then(c => contacts.value = c);
  }, []);

  return (
    <div className="flex flex-col p-m gap-s">
      <h1 className="text-2xl">Contacts</h1>
      <Grid items={contacts.value}>
        <GridColumn autoWidth>
          {({item}) => (
            <img src={item.pictureUrl} alt={item.name}/>
          )}
        </GridColumn>
        <GridColumn path="name" autoWidth/>
        <GridColumn path="jobTitle" autoWidth />
        <GridColumn path="lastContacted" autoWidth>
          {({item}) => (
            <DatePicker value={item.lastContacted} onChange={e =>
              Notification.show(`Updated last contacted date for ${item.name} to ${e.target.value}`)}/>
          )}
        </GridColumn>
      </Grid>
    </div>
  );
}