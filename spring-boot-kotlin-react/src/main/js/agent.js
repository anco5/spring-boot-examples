import agent from 'superagent';

const API_ROOT = 'http://localhost:8080/';

const requests = {
    get: url =>
        agent.get(`${API_ROOT}${url}`)
};

const Hello = {
    get: name =>
        requests.get('/hello').query({name: name})
}

export default {
    Hello
};