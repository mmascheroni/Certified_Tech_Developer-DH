// Bubble Sort:

// 1. Armá un array llamado estudiantes de 3 objetos, que cada uno de ellos tenga: nombre, edad y notaFinal.
let estudiantes = [
    {
        nombre: "Mauro Mascheroni",
        edad: 25,
        notaFinal: 10,
    },
    {
        nombre: "Ana Pardo",
        edad: 32,
        notaFinal: 12,
    },
    {
        nombre: "Lucas Hernandez",
        edad: 21,
        notaFinal: 6,
    },
    {
        nombre: "Xavi",
        edad: 21,
        notaFinal: 4,
    },
    {
        nombre: "Juan Martin",
        edad: 21,
        notaFinal: 7,
    },
];

// 2. Crear una funcion que ordene esos objetos por edad de forma ascendente
function ordenarEstAsc(arreglo) {
    for (let i = 0; i < arreglo.length; i++) {
        for (let j = 0; j < arreglo.length - 1; j++) {
            if (arreglo[j].edad > arreglo[j + 1].edad) {
                let temp = arreglo[j];

                arreglo[j] = arreglo[j + 1];

                arreglo[j + 1] = temp;
            }
        }
    }

    return arreglo;
}

console.log(ordenarEstAsc(estudiantes));

// 3. Crear una funcion que reciba por parametro el array y un string que indique de que modo se deberà ordenarlo (de forma ascendente o descendente)

function ordenar(arreglo, orden) {
    if (orden.toLowerCase() == "asc") {
        for (let i = 0; i < arreglo.length; i++) {
            for (let j = 0; j < arreglo.length - 1; j++) {
                if (arreglo[j].edad > arreglo[j + 1].edad) {
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
                if (arreglo[j].edad < arreglo[j + 1].edad) {
                    let temp = arreglo[j];

                    arreglo[j] = arreglo[j + 1];

                    arreglo[j + 1] = temp;
                }
            }
        }
    }

    return arreglo;
}

console.log(ordenar(estudiantes, "ASC"));
console.log(ordenar(estudiantes, "Desc"));

// 4. Crear una funcion que retorne un nuevo array. Este deberá contener solo los objetos cuya notaFinal sean mayores o iguales a 7

function mayorSiete(arr) {
    let notas = [];

    for (let i = 0; i < arr.length; i++) {
        if (arr[i].notaFinal >= 7) {
            notas.push(arr[i].notaFinal);
        }
    }

    return notas;
}

console.log(mayorSiete(estudiantes));

// 5. Agregar un atributo id a cada objeto que inicie en 1 y sea secuencial
function agregarId(arr) {
    let contadorId = 1;

    for (let i = 0; i < arr.length; i++) {
        for (let j = 0; j < arr.length; j++) {
            arr[j].id = j + 1;
        }
    }

    return arr;
}

console.log(agregarId(estudiantes));
