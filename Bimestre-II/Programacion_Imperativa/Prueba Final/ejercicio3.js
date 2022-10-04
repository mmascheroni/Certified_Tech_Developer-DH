// Crear una función que reciba la matriz por parámetro, sume todos los valores de la fila 1 y retorne la suma.
// Crear una función que reciba la matriz generada por parámetro y retorne un nuevo array con todos los valores pares de la matriz.

let matriz = [
    [5, 2, 2], // 0
    [2, 5, 2], // 1
    [4, 4, 5], // 2
];

function sumaPrimerFila(matriz) {
    let suma = 0;
    for (let i = 0; i < matriz[0].length; i++) {
        suma += matriz[0][i];
    }

    return suma;
}

console.log(sumaPrimerFila(matriz));
