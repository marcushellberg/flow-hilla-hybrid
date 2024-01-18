import { createElement } from 'react';
import { createRoot } from 'react-dom/client';
import App from './App.js';
import "@preact/signals-react/auto";

createRoot(document.getElementById('outlet')!).render(createElement(App));
