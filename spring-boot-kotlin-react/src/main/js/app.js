const React = require('react');
const ReactDOM = require('react-dom');
const $ = require('jquery');

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
        $.ajax({
            url: 'hello',
            data: {name: 'React'}
        }).done(json => {
            this.setState({name: json.name});
        })
    }
}

ReactDOM.render (
    <App />,
    document.getElementById('app')
)

