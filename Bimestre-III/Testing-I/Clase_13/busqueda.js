const response = require("./response_ability.json");

// console.log(response);

// console.log(response.results);

const results = response.results;

let searchForName = (name) => {
    for (let i = 0; i < results.length; i++) {
        if (results[i].name == name) {
            return `Se ha encontrado el pokemon con exito y la url es ${results[i].url}`;
        }
    }

    return "No se ha encontrado ningun pokemon con ese nombre " + name;
};
console.log(searchForName("sturdy"));
console.log(searchForName("sturdysds"));
