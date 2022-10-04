// 2) Crear una función que genere una matriz de 10x10. Cada fila debe tener solo 10
// números. La matriz debe verse así:

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

console.table(generarMatriz(90, 10));
