// Matrices:
// 1. Crear una matriz de 3 x 4
let numbers = [
    [1, 2, 3, 4],
    [5, 6, 7, 8],
    [9, 10, 11, 12],
];

// 2. Crear una funcion que suma todos los valores de la matriz que sean pares
function sumarPares(matriz) {
    let sumatoria = 0;

    for (let i = 0; i < matriz.length; i++) {
        for (j = 0; j < matriz[i].length; j++) {
            if (matriz[i][j] % 2 == 0) {
                sumatoria += matriz[i][j];
            }
        }
    }
    return sumatoria;
}

console.log(sumarPares(numbers));

// 3. Crear una funcion que cambie todos los valores de la matriz que sean multiplos de 5 por un numero 1
function cambiarMultiplosDeCinco(matriz) {
    for (let i = 0; i < matriz.length; i++) {
        for (let j = 0; j < matriz[i].length; j++) {
            if (matriz[i][j] % 5 == 0) {
                matriz[i][j] = 1;
            }
        }
    }

    return matriz;
}

console.log(cambiarMultiplosDeCinco(numbers));

// 4. Crear una funcion que genere un nuevo array donde se guarden todos los numeros impares de
// la matriz

function nuevoArrayImpares(matriz) {
    let impares = [];

    for (let i = 0; i < matriz.length; i++) {
        for (let j = 0; j < matriz[i].length; j++) {
            if (matriz[i][j] % 2 != 0) {
                if (matriz[i][j] != impares.includes(matriz[i][j])) {
                    impares.push(matriz[i][j]);
                }
            }
        }
    }

    return impares;
}

console.log(nuevoArrayImpares(numbers));

// 5. Crear una funcion que retorne la multiplicacion de todos los elementos de la fila 1

function multiplicarFila(matriz, fila) {
    let multiplicacion = 1;
    for (let i = 0; i < matriz[fila].length; i++) {
        multiplicacion *= matriz[fila][i];
    }

    return multiplicacion;
}

console.log(multiplicarFila(numbers, 0));
