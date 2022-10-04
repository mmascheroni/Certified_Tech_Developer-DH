let personas = [
    {
        id: 1,
        nombre: "Ale",
        edad: 15,
    },
    {
        id: 2,
        nombre: "Javi",
        edad: 83,
    },
    {
        id: 3,
        nombre: "Luis",
        edad: 26,
    },
    {
        id: 4,
        nombre: "Dan",
        edad: 16,
    },
    {
        id: 5,
        nombre: "Tito",
        edad: 22,
    },
    {
        id: 6,
        nombre: "Marina",
        edad: 76,
    },
    {
        id: 7,
        nombre: "Susy",
        edad: 35,
    },
    {
        id: 8,
        nombre: "John",
        edad: 25,
    },
];

function ordenarLista(lista) {
    for (let i = 0; i < lista.length; i++) {
        for (let j = 0; j < lista.length - 1; j++) {
            if (lista[j].edad > lista[j + 1].edad) {
                let temp = lista[j];

                lista[j] = lista[j + 1];

                lista[j + 1] = temp;
            }
        }
    }

    return lista;
}

let personasOrdenado = ordenarLista(personas);
console.log(personasOrdenado);

const busquedaBinaria = (lista, item) => {
    let inicio = 0;

    let final = lista.length - 1;

    while (inicio <= final) {
        const mid = Math.floor((inicio + final) / 2);

        const guess = lista[mid].edad;

        if (guess == item) {
            return lista[mid].nombre;
        }

        if (guess > item) {
            final = mid - 1;
        } else {
            inicio = mid + 1;
        }
    }

    return null;
};

let ordenPersonas = busquedaBinaria(personasOrdenado, 25);
console.log(ordenPersonas);
