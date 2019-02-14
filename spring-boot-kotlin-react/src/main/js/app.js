import React from 'react';
import ReactDOM from 'react-dom';
import agent from './agent';

class App extends React.Component {

    constructor(props) {
        super(props);
        this.state = {name: "World"}
    }

    render() {
        return (
          <h1>Hello {this.state.name}</h1>
        );
    }

    componentDidMount() {
        agent.Hello.get('Bill Jone').then(res => {
            this.setState({name: res.body.name});
        })
    }
}

ReactDOM.render (
    <App />,
    document.getElementById('app')
)

