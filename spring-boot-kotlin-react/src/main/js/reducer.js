import home from './reducers/home';
import common from './reducers/common';
import postList from './reducers/postList';
import todos from './reducers/todos';
import visibilityFilter from './reducers/visibilityFilter';
import { combineReducers } from 'redux';
import { routerReducer } from 'react-router-redux';

export default combineReducers({
    home,
    common,
    postList,
    todos,
    visibilityFilter,
    router: routerReducer
});