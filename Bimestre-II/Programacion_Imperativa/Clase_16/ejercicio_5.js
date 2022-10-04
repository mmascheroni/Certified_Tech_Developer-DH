/**
 * Escribir una función que reciba una array
 *  y solo imprima los valores que se repiten.
 *  Por ejemplo, dada la siguiente array e índice,
 *  la función imprimirá '6,23,33,100'.
 * let array = [3,6,67,6,23,11,100,8,93,0,17,24,7,1,33,45,28,33,23,12,99,100];
 */

let array = [
    3, 6, 67, 6, 23, 11, 100, 8, 93, 0, 17, 24, 7, 1, 33, 45, 28, 33, 23, 12,
    99, 100, 3, 3,
];

// let arrayOrdenado = [...array].sort();
// console.log(arrayOrdenado);

// function valoresDuplicados(arr) {
//     let duplicados = [];
//     const arrayOrdenado = [...arr].sort();

//     for (let i = 0; i < arrayOrdenado.length; i++) {
//         if (arrayOrdenado[i + 1] === arrayOrdenado[i]) {
//             duplicados.push(arrayOrdenado[i]);
//         }
//     }

//     return duplicados;
// }

// console.log(valoresDuplicados(array));

function valoresDuplicados(arreglo) {
    const duplicados = [];
    const unicos = [];
    arreglo.forEach((element) => {
        if (!unicos.includes(element)) {
            unicos.push(element);
        } else if (!duplicados.includes(element)) {
            duplicados.push(element);
        }
    });

    return console.log(duplicados);
}

valoresDuplicados(array);
