import {lazy} from 'react';
import {createBrowserRouter, RouteObject} from 'react-router-dom';
import {serverSideRoutes} from "Frontend/generated/flow/Flow";
import ContactsView from "Frontend/views/ContactsView";

export const routes = [
    {path: '/', element: <ContactsView/>, handle: {title: 'HillaView View'}},
    ...serverSideRoutes
] as RouteObject[];

export default createBrowserRouter(routes);
