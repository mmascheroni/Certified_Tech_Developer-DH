// Similar String.split()
// Deberás crear una función llamada split que reciba un string y simule el comportamiento de la función original. Si no estás seguro de cómo funciona, Google puede ayudarte. Importante: no podés usar el String.split(). Ejemplo:
// split(“hola”) debe retornar [“h”,”o”,”l”,”a”]
// split(“chau”) debe retornar [“c”,”h”,”a”,”u”]

const split = (string) => {
    let arreglo = [];
    for (let i = 0; i < string.length; i++) {
        arreglo.push(string[i]);
    }

    return arreglo;
};

let hola = split("hola");
console.log(hola);
let chau = split("chau");
console.log(chau);
