import {
    APP_LOAD
} from '../constants/actionTypes';

const defaultState = {
    appName: 'Conduit'
};

export default (state = defaultState, action) => {
    switch (action.type) {
        case APP_LOAD:
            return {
                ...state
            };
        default:
            return state;
    }
};