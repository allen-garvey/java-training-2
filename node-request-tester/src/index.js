const fetch = require('node-fetch');

const START = 1;
const END = 1000;

const requests = [];

for(let i=END;i>=START;i--){
    requests.push(fetch(`http://localhost:8080/max/update?max=${i}`)
        .catch((err) => console.log(err.message))
        .then(() => console.log(`${i} requested`))
    );
}

Promise.all(requests).then(() => {
    console.log(`All requests sent. Max should be ${END}`);
});