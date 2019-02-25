import React from 'react';
import Home from '../components/Home';
import { connect } from 'react-redux';
import { store } from "../store";
import {
    APP_LOAD
} from "../constants/actionTypes";

const mapStateToProps = state => {
    return {
        appName: state.common.appName
    }
};

const mapDispatchToProps = dispatch => ({
    onLoad: () =>
        dispatch({ type: APP_LOAD })
});

class App extends React.Component {

    componentWillMount() {
        this.props.onLoad();
    }

    render() {
        return (
            <div>
                <Home/>
            </div>
        );
    }
}

export default connect(mapStateToProps, mapDispatchToProps)(App)