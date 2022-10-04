let personas = [
    {
        nombre: "Dua",
        apellido: "Lipa",
        ocupacion: "cantante",
        estatura: 173,
    },
    {
        nombre: "Ariana",
        apellido: "Grande",
        ocupacion: "cantante",
        estatura: 160,
    },
    {
        nombre: "Taylor",
        apellido: "Swift",
        ocupacion: "cantante",
        estatura: 180,
    },
];

function bubbleSort(lista) {
    for (let i = 0; i < lista.length; i++) {
        for (let j = 0; j < lista.length - 1; j++) {
            if (lista[j].estatura > lista[j + 1].estatura) {
                let temp = lista[j];

                lista[j] = lista[j + 1];

                lista[j + 1] = temp;
            }
        }
    }

    return console.log(lista);
}

bubbleSort(personas);
