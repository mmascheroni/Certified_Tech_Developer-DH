/**
 * Declara una variable que contenga una matriz
 * de 5x5 llena de puros numeros enteros y positivos
 */

/**
 * Luego, escribe un algoritmo para sumar todos
 * los numeros en la matriz.
 */

let matrizCincoPorCinco = [
    [1, 2, 3, 4, 5],
    [5, 7, 8, 9, 10],
    [11, 12, 13, 14, 15],
    [16, 17, 18, 19, 20],
    [21, 22, 23, 24, 25],
];

function sumarValores(arreglo) {
    let valorSuma = 0;

    for (let i = 0; i < arreglo.length; i++) {
        for (let j = 0; j < arreglo[i].length; j++) {
            valorSuma += arreglo[i][j];
        } // Columnas
    } // Filas

    return valorSuma;
}

console.log(sumarValores(matrizCincoPorCinco));
