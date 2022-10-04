function numerosParesoImpares(num1, num2) {
    if (num1 != 0 && num2 != 0) {
        if (num1 % 2 == 0 && num2 % 2 == 0) {
            return num1 / num2;
        }
    }
    if (num1 % 2 != 0 && num2 % 2 != 0) {
        return num1 + num2;
    } else {
        return -1;
    }
}

// console.log(numerosParesoImpares(2, 2));
// console.log(numerosParesoImpares(1, 1));
// console.log(numerosParesoImpares(0, 0));
// console.log(numerosParesoImpares(0, 2));

function BooleanoNumero(bool, num) {
    if (bool == true && num % 5 == 0) {
        return num * 2;
    }
    if (bool == true && num % 5 != 0) {
        return num / 2;
    }
    if (bool == false) {
        return num;
    }
}

// console.log(BooleanoNumero(true, 5));
// console.log(BooleanoNumero(true, 10));
// console.log(BooleanoNumero(true, 7));
// console.log(BooleanoNumero(false, 5));

let articulos = [
    {
        id: 4,
        precio: 3321,
        tipo: "Deportivo",
        nombre: "Zapatillas",
    },
    {
        id: 22,
        precio: 4482,
        tipo: "Moda",
        nombre: "Zapatillas",
    },
    {
        id: 1,
        precio: 3600,
        tipo: "Moda",
        nombre: "Zapatos",
    },
    {
        id: 44,
        precio: 8889,
        tipo: "Moda",
        nombre: "Remera",
    },
];

function filtrarArticulos(arreglo, tipo, precioMax) {
    let nuevoArray = [];

    arreglo.map(function (elemento) {
        if (elemento.tipo == tipo && elemento.precio <= precioMax) {
            nuevoArray.push(elemento);
        }
    });

    return nuevoArray;
}

console.log(filtrarArticulos(articulos, "Deportivo", 5000));
