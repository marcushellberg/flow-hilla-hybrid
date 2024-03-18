package com.example.application;

import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

// snippet start
@Route("contacts")
public class ContactsView extends VerticalLayout {

    public ContactsView(ContactService contactService) {
        var grid = new Grid<>(Contact.class);
        grid.setItems(contactService.getContacts());

        grid.addComponentColumn(contact ->
                new Image(contact.getPictureUrl(), contact.getName())).setAutoWidth(true);

        grid.addColumn(Contact::getName).setHeader("Name").setAutoWidth(true);
        grid.addColumn(Contact::getCompany).setHeader("Company").setAutoWidth(true);
        grid.addColumn(Contact::getJobTitle).setHeader("Job Title").setAutoWidth(true);

        grid.addComponentColumn(contact ->
                new DatePicker(contact.getLastContacted(), e ->
                    Notification.show( contact.getName() + " updated: " + e.getValue())
        )).setHeader("Last Contacted").setAutoWidth(true);

        add(new H1("Leads"), grid);
    }
}
// snippet end