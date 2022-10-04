let peliculas = [
    "star wars",
    "totoro",
    "rocky",
    "pulp fiction",
    "la vida es bella",
];
// let valor = peliculas[0];
// console.log(valor.toUpperCase());

function toUpperCase(arr) {
    let nuevoArray = [];
    let valor;
    for (let i = 0; i < arr.length; i++) {
        valor = arr[i];
        valor = valor.toUpperCase();
        nuevoArray.push(valor);
    }

    return nuevoArray;
}

// console.log(toUpperCase(peliculas));

let peliculasDos = [
    "toy story",
    "finding Nemo",
    "kung-fu panda",
    "wally",
    "fortnite",
];

function juntarArreglos(arr1, arr2) {
    let arreglo = [];

    for (let i = 0; i < arr1.length; i++) {
        let valor = arr1[i];
        valor = valor.toUpperCase();
        arreglo.push(valor);
    }

    for (let i = 0; i < arr1.length; i++) {
        let valor = arr2[i];
        valor = valor.toUpperCase();
        arreglo.push(valor);
    }

    return arreglo;
}

// console.log(juntarArreglos(peliculas, peliculasDos));

function imprimirInverso(arr) {
    for (let i = arr.length - 1; i >= 0; i--) {
        console.log(arr[i]);
    }

    return "---->Fin<----";
}

// console.log(imprimirInverso(peliculas));

function invertido(arr) {
    let nuevoArray = [];
    for (let i = arr.length - 1; i >= 0; i--) {
        let valor = arr[i];
        nuevoArray.push(valor);
    }

    return nuevoArray;
}

console.log(invertido(peliculas));

// Simulacion al metodo Join

let palabra = ["H", "o", "l", "a"];

function join(arr) {
    let palabra = "";
    for (let i = 0; i < arr.length; i++) {
        palabra += arr[i];
    }

    return palabra;
}

console.log(join(palabra));
