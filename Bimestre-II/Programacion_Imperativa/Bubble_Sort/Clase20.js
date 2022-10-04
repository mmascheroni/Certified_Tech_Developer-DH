// Ejercicio 1
// En un concurso de fotografía, donde los usuarios publican una fotografía y obtienen
// likes, se registra la cantidad de likes obtenidos por cada usuario en un array. Ordenar
// los valores para poder indicar cuál fue la mayor cantidad de likes obtenidos, cuánto
// obtuvo el segundo, cuánto el tercero y cuánto el que menos likes obtuvo —suponer
// que participaron 15 usuarios y suponer para cada uno, una cantidad de likes—.

// Deberás construir tu propio array de prueba, el cual contendrá un número de objetos (determinado por vos) donde cada objeto tendrá las siguientes propiedades:
// likes: numero
// username: string

let likes = [
    {
        nombre: "Carlos",
        likes: 40,
    },
    {
        nombre: "Lucia",
        likes: 30,
    },
    {
        nombre: "Mauro",
        likes: 75,
    },
    {
        nombre: "Anita",
        likes: 80,
    },
    {
        nombre: "Javier",
        likes: 20,
    },
];

function ordenarLista(arreglo, numero) {
    for (let i = 0; i < arreglo.length; i++) {
        for (let j = 0; j < arreglo.length - 1; j++) {
            if (arreglo[j].likes < arreglo[j + 1].likes) {
                let temp = arreglo[j];

                arreglo[j] = arreglo[j + 1];

                arreglo[j + 1] = temp;
            }
        }
    }

    return arreglo[numero];
}

// console.log(ordenarLista(likes, 0));
// console.log(ordenarLista(likes, 1));
// console.log(ordenarLista(likes, 2));
// console.log(ordenarLista(likes, 4));

// Ejercicio 2
// El servicio meteorológico, para llevar el control diario de temperatura, utiliza un
// objeto temperatura donde registra día —valor numérico del día—, mes —valor
// numérico—, temperatura máxima y temperatura mínima, correspondiente a dicho
// día. Las temperaturas —objeto temperatura— están cargados en un array.

// Deberás construir tu propio array de prueba, el cual contendrá un número de objetos (determinado por vos) donde cada objeto tendrá las siguientes propiedades:
// dia: numero
// mes: numero
// tempMax: número
// tempMin: número

// a) Ordenar por temperatura mínima de menor a mayor.
// b) Ordenar por temperatura máxima de mayor a menor.

let temperaturas = [
    {
        dia: 15,
        mes: 10,
        tempMax: 23,
        tempMin: 10,
    },
    {
        dia: 16,
        mes: 10,
        tempMax: 25,
        tempMin: 12,
    },
    {
        dia: 17,
        mes: 10,
        tempMax: 18,
        tempMin: 9,
    },
    {
        dia: 18,
        mes: 10,
        tempMax: 29,
        tempMin: 13,
    },
    {
        dia: 19,
        mes: 10,
        tempMax: 31,
        tempMin: 14,
    },
];

// a) Ordenar por temperatura mínima de menor a mayor.

function orderMenoraMayor(arreglo) {
    for (let i = 0; i < arreglo.length; i++) {
        for (let j = 0; j < arreglo.length - 1; j++) {
            if (arreglo[j].tempMin > arreglo[j + 1].tempMin) {
                let temp = arreglo[j];

                arreglo[j] = arreglo[j + 1];
                arreglo[j + 1] = temp;
            }
        }
    }

    return console.log(arreglo);
}

orderMenoraMayor(temperaturas);

// b) Ordenar por temperatura máxima de mayor a menor.

function orderMayoraMenor(arreglo) {
    for (let i = 0; i < arreglo.length; i++) {
        for (let j = 0; j < arreglo.length - 1; j++) {
            if (arreglo[j].tempMax < arreglo[j + 1].tempMax) {
                let temp = arreglo[j];

                arreglo[j] = arreglo[j + 1];
                arreglo[j + 1] = temp;
            }
        }
    }

    return console.log(arreglo);
}

orderMayoraMenor(temperaturas);
