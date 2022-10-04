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
        estado: "casada",
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
    while (inicio <= fin) {
        let mitad = Math.floor((inicio + fin) / 2);
        let elmentomedio = ordenado[mitad].apellido;
        if (elmentomedio === item) {
            return ordenado[mitad];
        }
        if (elmentomedio > item) {
            fin = mitad - 1;
        } else {
            inicio = mitad + 1;
        }
    }
    return null;
};

console.log(busquedabinaria("Lobato"));
