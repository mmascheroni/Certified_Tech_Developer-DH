let personas = [
    {
        nombre: "Lucia",
        apellido: "lopez",
        edad: 29,
        estado: "soltero",
    },
    {
        nombre: "Juan",
        apellido: "Perez",
        edad: 33,
        estado: "casado",
    },
    {
        nombre: "Lucia",
        apellido: "Garcia",
        edad: 26,
        estado: "casado",
    },
    {
        nombre: "Hugo",
        apellido: "De Leon",
        edad: 55,
        estado: "soltero",
    },
    {
        nombre: "Ruben",
        apellido: "Sosa",
        edad: 60,
        estado: "casado",
    },
    {
        nombre: "Antonio",
        apellido: "Pacheco",
        edad: 45,
        estado: "casado",
    },
    {
        nombre: "Zumlma",
        apellido: "Lobato",
        edad: 55,
        estado: "soltera",
    },
];

function bubbleSort(array) {
    for (let i = 0; i < array.length; i++) {
        for (let j = 0; j < array.length - 1; j++) {
            if (array[j].apellido > array[j + 1].apellido) {
                let aux = array[j];
                array[j] = array[j + 1];
                array[j + 1] = aux;
            }
        }
    }
    return array;
}

const busquedabinaria = (item) => {
    let ordenado = bubbleSort(personas);
    let inicio = 0;
    let fin = ordenado.length - 1;
    let contador = 0;
    for (let i = 0; i < ordenado.length; i++) {
        if (item === ordenado[i].estado) {
            contador += 1;
        }
    }
    return contador;
};
console.log(busquedabinaria("casado"));
