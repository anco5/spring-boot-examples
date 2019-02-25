import agent from 'superagent';

const API_ROOT = 'http://localhost:8080/';

const requests = {
    get: url =>
        agent.get(`${API_ROOT}${url}`),
    hack: url =>
        agent.get(`${HACKER_NEWS_ROOT}${url}`)
};

const Hello = {
    get: name =>
        requests.get('/hello').query({name: name})
}

const Posts = {
    all: () =>
        requests.hack('/posts')
}

export default {
    Hello,
    Posts
};