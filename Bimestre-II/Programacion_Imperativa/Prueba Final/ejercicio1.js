// Ejercicio 1

let paises = [
    {
        nombre: "Argentina",
        continente: "Sudamérica",
        poblacion: 40000000,
    },
    {
        nombre: "Colombia",
        continente: "Sudamérica",
        poblacion: 50372000,
    },

    {
        nombre: "Brasil",
        continente: "Sudamérica",
        poblacion: 300000000,
    },
    {
        nombre: "Etiopía",
        continente: "África",
        poblacion: 15000000,
    },
    {
        nombre: "Chile",
        continente: "Sudamérica",
        poblacion: 10000000,
    },
];

// Crear una función que reciba como parámetro un arreglo de objetos, un continente, y un número de población.
// La misma debe retornar un nuevo arreglo solo con los países que sean del continente pasado por parámetro, y además, que su población sea mayor o igual a la del parámetro.
// Si no encuentra coincidencias deberá retornar un array vacío

function nuevoArreglo(arreglo, cont, pob) {
    let arr = [];

    for (let i = 0; i < arreglo.length; i++) {
        if (arreglo[i].continente == cont) {
            if (arreglo[i].poblacion >= pob) {
                arr.push(arreglo[i].nombre);
            }
        } else {
            arr;
        }
    }

    return arr;
}

console.log(nuevoArreglo(paises, "África", 12000000));
console.log(nuevoArreglo(paises, "Sudamérica", 50372000));
