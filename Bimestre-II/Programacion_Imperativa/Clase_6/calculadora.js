const prompt = require("prompt-sync")({ sigint: true });

function sumar(num1, num2) {
  return num1 + num2;
}

function restar(num1, num2) {
  return num1 - num2;
}

function multiplicar(num1, num2) {
  return num1 * num2;
}

function dividir(num1, num2) {
  return num1 / num2;
}

console.log(
  "-------------- Testeo de Operaciones / Calculadora --------------"
);

let num1 = parseInt(prompt(`Por favor ingrese el primer numero: `));
let num2 = parseInt(prompt(`Por favor ingrese el segundo numero: `));

let opcion = parseInt(
  prompt(
    "Escoge la operacion: 1- Sumar, 2- Restar, 3- Multiplicar, 4- Dividir: "
  )
);

while (true) {
  if (opcion == 1) {
    console.log(sumar(num1, num2));
    break;
  } else if (opcion == 2) {
    console.log(restar(num1, num2));
    break;
  } else if (opcion == 3) {
    console.log(multiplicar(num1, num2));
    break;
  } else if (opcion == 4) {
    console.log(dividir(num1, num2));
    break;
  } else {
    opcion = parseInt(
      prompt(
        "Por favor del 1 al 4 --> Escoge la operacion: 1- Sumar, 2- Restar, 3- Multiplicar, 4- Dividir: "
      )
    );
  }
}

// -----> Funciones Extras <-------

function cuadradoDeUnNumero(num) {
  let cuadrado = multiplicar(num, num);
  return cuadrado;
}

function promedioDeTresNumeros(num1, num2, num3) {
  let suma = num1 + num2 + num3;
  let promedio = dividir(suma, 3);
  return promedio;
}

function calcularPorcentaje(total, porcentaje) {
  let regla = multiplicar(total, porcentaje);
  let resultadoPorcentaje = dividir(regla, 100);
  return resultadoPorcentaje;
}

// console.log(calcularPorcentaje(300, 15));

function generadorDePorcentaje(porcentaje, numero) {
  let regla = multiplicar(porcentaje, 100);
  let total = dividir(regla, numero);
  return total;
}

// console.log(generadorDePorcentaje(2, 200));
