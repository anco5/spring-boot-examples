import React from 'react';
import { connect } from 'react-redux';
import {
    HOME_PAGE_LOADED
} from "../../constants/actionTypes";

const mapStateToProps = state => ({
    ...state.home,
    appName: state.common.appName
});

const mapDispatchToProps = dispatch => ({
    onLoad: () =>
        dispatch({ type: HOME_PAGE_LOADED })
})

class Home extends React.Component {

    componentWillMount() {
        this.props.onLoad();
    }

    render() {
        return (
            <div className="home-page">
                <p>Home Page</p>
                <p>{this.props.appName}</p>
            </div>
        )
    }
}

export default connect(mapStateToProps, mapDispatchToProps)(Home)