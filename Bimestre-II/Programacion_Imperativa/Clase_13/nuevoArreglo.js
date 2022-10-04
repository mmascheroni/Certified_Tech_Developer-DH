// Nuevo arreglo
// Deberás crear una función llamada nuevoArreglo que reciba un número como parámetro y que devuelva un nuevo arreglo con tantos elementos como el número que le hayas pasado. Ejemplo:
// nuevoArreglo(5) debe retornar [1,2,3,4,5]
// nuevoArreglo(10) debe retornar [1,2,3,4,5,6,7,8,9,10]

const nuevoArreglo = (arrLength) => {
    let arreglo = [];

    for (let i = 1; i <= arrLength; i++) {
        arreglo.push(i);
    }

    return arreglo;
};

let arreglo5 = nuevoArreglo(5);
console.log(arreglo5);

let arreglo10 = nuevoArreglo(10);
console.log(arreglo10);
