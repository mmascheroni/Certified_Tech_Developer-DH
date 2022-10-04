// 3) Por último, vamos a generar dos funciones:
// a) Una va a sumar los valores en la diagonal marcada en rojo.
// b) La otra va a marcar los valores de la diagonal marcada en verde.
// Ambas funciones deben devolver un resultado único.

function generarMatriz(limiteFilas, limiteCol) {
    let arreglo = [];

    for (let i = 0; i <= limiteFilas; i += 10) {
        let aux = [];
        for (let j = 1; j <= limiteCol; j++) {
            if (i === 0) {
                aux.push(j);
            } else {
                aux.push(i + j);
            }
        }

        arreglo.push(aux);
    }

    return arreglo;
}

let matrizDiezPorDiez = generarMatriz(90, 10);
console.table(matrizDiezPorDiez);

function sumarDiagonal(matriz) {
    let resultado = 0;
    let resultadoDos = 0;

    for (let i = 0; i < matriz.length; i++) {
        for (let j = 0; j < matriz[i].length; j++) {
            if (i == j) {
                resultado += matriz[i][j];
            }
            if (i + j == matriz.length - 1) {
                // suma cuando el indice de la col y la fila suman 9, que es el largo del array.
                console.log(i + j);
                console.log(matriz.length - 1);
                resultadoDos += matriz[i][j];
            }
        }
    }

    return `El resultado de la diagonal principal es: ${resultado}. 
El resultado de la diagonal secundaria es: ${resultadoDos}.`;
}

let sumaDiagonal = sumarDiagonal(matrizDiezPorDiez);
console.log(sumaDiagonal);
