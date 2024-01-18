import {lazy} from 'react';
import {createBrowserRouter, RouteObject} from 'react-router-dom';
import {serverSideRoutes} from "Frontend/generated/flow/Flow";
import HillaView from "Frontend/views/HillaView";

export const routes = [
    {path: '/', element: <HillaView/>, handle: {title: 'HillaView View'}},
    ...serverSideRoutes
] as RouteObject[];

export default createBrowserRouter(routes);
