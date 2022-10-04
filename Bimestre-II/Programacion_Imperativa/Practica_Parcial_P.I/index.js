// Ejercicio 1:
// Declarar tres variables y asignarles un número entero a las tres.
// Crear una función que reciba tres parámetros, que pregunte:
// Si el primero es mayor que el segundo, debe devolver la multiplicación del segundo por el tercero.
// Si el segundo es par, que devuelva un texto que concatene al segundo número con un texto que diga ‘es par’.
// Si la suma de los tres es múltiplo de 3, debe devolver un texto que diga: la suma de estos tres números es múltiplo de 3.
// Invocar a la función pasándole por parámetros las tres variables declaradas en el punto 1

let numberOne = 9;
let numberTwo = 6;
let numberThree = 9;

function questions(num1, num2, num3) {
    if (num1 > num2) {
        console.log(num2 * num3);
    }
    if (num2 % 2 == 0) {
        console.log(numberTwo + " Es par");
    }
    if ((num1 + num2 + num3) % 3 == 0) {
        console.log("La suma de estos tres numeros es multiplo de 3");
    }
}

// questions(numberOne, numberTwo, numberThree);

// Ejercicio 2:
// Crear un objeto literal que contenga las siguientes propiedades y asignarles un valor:
// nombre
// apellido
// edad
// estaEmpleado (bool)
// Declarar un función que:
// Si la edad es mayor a 18 años y está empleado, devolverá una frase que diga: [nombre] [apellido] está empleado y es mayor de edad.
// Si es mayor de edad pero no está empleado, devolverá una frase que diga: [nombre] [apellido] NO está empleado y es mayor de edad.
// Si no es mayor ni está empleado, devolverá una frase que diga: [nombre] [apellido] NO está empleado y NO es mayor de edad.

let objectLiteral = {
    nombre: "Mauro",
    apellido: "Mascheroni",
    edad: 17,
    estaEmpleado: false,
};

function workWithObjectLiteral(oj) {
    if (oj.edad > 18 && oj.estaEmpleado == true) {
        console.log(
            `${oj.nombre} ${oj.apellido} esta empleado y es mayor de edad`
        );
    }

    if (oj.edad >= 18 && oj.estaEmpleado == false) {
        console.log(
            `${oj.nombre} ${oj.apellido} NO esta empleado y es mayor de edad`
        );
    }

    if (oj.edad < 18 && oj.estaEmpleado == false) {
        console.log(
            `${oj.nombre} ${oj.apellido} NO esta empleado y NO es mayor de edad`
        );
    }
}

// workWithObjectLiteral(objectLiteral);

let autos = [
    {
        marca: "Toyota",
        anio: 2022,
        color: "rojo",
    },
    {
        marca: "Renault",
        anio: 2020,
        color: "gris",
    },
    {
        marca: "Peugeot",
        anio: 2021,
        color: "rojo",
    },
    {
        marca: "Fiat",

        anio: 2019,
        color: "negro",
    },
];

// Eliminar el último elemento del arreglo usando un método de arrays.

let arrayOutLastElement = autos.pop();

// console.log(arrayOutLastElement);

let autosNuevos = [];

autos.map(function (element) {
    if (element.anio > 2019) {
        autosNuevos.push(element);
    }
    return autosNuevos;
});

console.log(autosNuevos);
