import ReactDOM from 'react-dom';
import React from 'react';
import { Provider } from 'react-redux';
import { createStore } from "redux";
import rootReducer from './reducer';
import App from './components/App';

const store = createStore(rootReducer);

ReactDOM.render(
    <Provider store={store}>
            <App />
    </Provider>,
    document.getElementById('root')
);