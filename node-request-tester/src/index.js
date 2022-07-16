const fetch = require('node-fetch');

const START = 1;
const END = 10000;

const requests = [];

// for(let i=START;i<=END;i++){
//     requests.push(fetch(`http://localhost:8080/max/update?max=${i}`));
// }
for(let i=END;i>=START;i--){
    requests.push(fetch(`http://localhost:8080/max/update?max=${i}`));
}

Promise.all(requests).then(() => {
    console.log(`All requests sent. Max should be ${END}`);
});