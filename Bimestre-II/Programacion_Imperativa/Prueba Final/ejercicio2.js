// Crear una función llamada bubbleSort que reciba como parámetros el array y un string que represente el sentido de ordenamiento, la función deberá realizar un ordenamiento interno del array según el orden indicado

// “ASC” lo ordenará ascendente
// “DESC” lo ordenará descendente

// Para analizar el correcto funcionamiento imprimir por consola el array antes y después de ejecutar la función.

let arrayDeNumeros = [1, 2, 3, 8, 9, 104, 5, 6, 7, 15];

function ordenar(arreglo, orden) {
    if (orden.toLowerCase() == "asc") {
        for (let i = 0; i < arreglo.length; i++) {
            for (let j = 0; j < arreglo.length - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    let temp = arreglo[j];

                    arreglo[j] = arreglo[j + 1];

                    arreglo[j + 1] = temp;
                }
            }
        }
    }
    if (orden.toLowerCase() == "desc") {
        for (let i = 0; i < arreglo.length; i++) {
            for (let j = 0; j < arreglo.length - 1; j++) {
                if (arreglo[j] < arreglo[j + 1]) {
                    let temp = arreglo[j];

                    arreglo[j] = arreglo[j + 1];

                    arreglo[j + 1] = temp;
                }
            }
        }
    }

    return arreglo;
}

console.log(ordenar(arrayDeNumeros, "ASC"));
console.log(ordenar(arrayDeNumeros, "Desc"));
