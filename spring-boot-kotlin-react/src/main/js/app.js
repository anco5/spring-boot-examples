const React = require('react');
const ReactDOM = require('react-dom');

class App extends React.Component {
    render() {
        return (
          <h1>Hello Spring Boot and React with Kotlin</h1>
        );
    }
}

ReactDOM.render (
    <App />,
    document.getElementById('app')
)

