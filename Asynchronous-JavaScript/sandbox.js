/*//What is Async JavaScript?


console.log(1);
console.log(2);
setTimeout(() => {
    console.log("calback function fired");
}, 2000);
console.log(3);
console.log(4);
*/

/*//HTTP Requests

  const request = new XMLHttpRequest();
  request.open('GET','https://jsonplaceholder.typicode.com/todos');
  request.send();
*/

/*//Status Codes

const request = new XMLHttpRequest();
    request.open('GET','https://jsonplaceholder.typicode.com/todos');
    request.send();

    request.addEventListener('readystatechange', () => {
        //console.log(request, request.readyState);
        if(request.readyState === 4 && request.status === 200){
            console.log(request.responseText);
        }
        else if (request.readyState === 4){
            console.log(request.status);
        }
    });
*/

/*//Callback Functions


const getTodos = (callback) => {

    const request = new XMLHttpRequest();
    request.open('GET','https://jsonplaceholder.typicode.com/todos');
    request.send();

    request.addEventListener('readystatechange', () => {
        //console.log(request, request.readyState);
        if(request.readyState === 4 && request.status === 200){
            callback(undefined, request.responseText);
        }
        else if (request.readyState === 4){
            callback(request.status, undefined);
        }
    });
}

console.log(1);
console.log(2);
getTodos((err, data) => {
    console.log('callback fired');
    if (err) {
        console.log(err);   
    }
    else{
        console.log(data);
    }
});
console.log(3);
console.log(4);
*/

/*//Using JSON Data

console.log(1);
console.log(2);
const getTodos = (callback) => {

    const request = new XMLHttpRequest();
    request.open("GET", "luigi.json")
    request.send();

    request.addEventListener("readystatechange",() => {
        if (request.readyState === 4 && request.status === 200){
            const data = JSON.parse(request.responseText)
            callback(undefined, data);
        } else if (request.readyState === 4){
            callback(request.status, undefined);
        }
    });
}

getTodos((err, data) => {
    console.log('callback fired');
    if (err) {
        console.log(err);
    } else {
        console.log(data);
    }
})
console.log(3);
console.log(4);
*/

/*//Callback Hell
console.log(1);
console.log(2);
const getTodos = (resource, callback) => {

    const request = new XMLHttpRequest();
    request.open("GET", "luigi.json")
    request.send();

    request.addEventListener("readystatechange",() => {
        if (request.readyState === 4 && request.status === 200){
            const data = JSON.parse(request.responseText)
            callback(undefined, data);
        } else if (request.readyState === 4){
            callback(request.status, undefined);
        }
    });
}

getTodos( "todos/luigi.json",(err, data) => {
    console.log(data);
    getTodos( "todos/mario.json",(err, data) => {
        console.log(data);
        getTodos( "todos/shaun.json",(err, data) => {
            console.log(data);
        });
    });
});
console.log(3);
console.log(4);
*/

/*//Promises


const getTodos = (resource) => {

    return new Promise(resolve, reject => {

        const request = new XMLHttpRequest();
        request.open("GET", "luigi.json")
        request.send();
    
        request.addEventListener("readystatechange",() => {
            if (request.readyState === 4 && request.status === 200){
                const data = JSON.parse(request.responseText)
                resolve(data);
            } else if (request.readyState === 4){
                reject('error geting resource');
            }
        });
    });
}

getTodos('todos/luigis.json').then(data => {
    console.log('promise resolved:',data);
}).catch(err => {
    console.log('promise reject:',err);
});

/*
const getSometings = () => {
    return new Promise(resolve, reject => {
        //fetch something
        resolve('some data');
        reject('some error');
    });
}
/*
getSometings().then((data) => {
    console.log(data);
},(err) => {
    console.log(err);
})


getSometings().then(data => {
    console.log(data);
}).catch(err => {
    console.log(err);
})
*/

/*//Chaining Promises


const getTodos = (resource) => {

    return new Promise(resolve, reject => {

        const request = new XMLHttpRequest();
        request.open("GET", "luigi.json")
        request.send();
    
        request.addEventListener("readystatechange",() => {
            if (request.readyState === 4 && request.status === 200){
                const data = JSON.parse(request.responseText)
                resolve(data);
            } else if (request.readyState === 4){
                reject('error geting resource');
            }
        });
    });
}

getTodos('todos/luigis.json').then(data => {
    console.log('promise 1 resolved:',data);
    return getTodos('todos/shaun.json');
}).then(data => {
    console.log('promise 2 resolved:',data);
    return getTodos('todos/mario.json');
}).then(data => {
    console.log('promise 3 resolved:',data);
}).catch(err => {
    console.log('promise reject:',err);
});
*/

/*//The Fetch API

fetch("todos/luigi.json").then((response) =>{
    console.log('resolved', response);
    return response.json();
}).then((data) => {
    console.log(data);
    return response.json();
}).catch((err) => {
    console.log('reject', err);
});
*/

/*//Async & Await
const getTodos = async () => {

   const response = await fetch('todos/luigi.json');
   const data = await response.json();
   return data; 
};
getTodos().then(data => {
    console.log(data);
});*/

/*//Throwing Errors

const getTodos = async () => {
    const response = await fetch('todos/luigi.json');

    if(response.status === 200){
        const data = await response.json();

        return data;
    }
    else{
        throw new Error('cannot fetch the data');
    }
    
}

getTodos()
    .then(data => console.log('resolve',data))
    .catch(err => console.log('reject',err));
*/