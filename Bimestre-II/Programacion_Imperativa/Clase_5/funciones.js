const prompt = require("prompt-sync")({ sigint: true });

// Funciones simples
// En todos los casos en que se reciban parámetros, utilizar el prompt para el ingreso

// por consola de los valores-
// 1. Crear una función que convierta pulgadas en centímetros.
// Recibe por parámetro pulgadas y retorna su equivalente en centímetros.

let inches = prompt(
  "Por favor ingrese las pulgadas a convertir en centimetros: "
);

function incToCm(inches) {
  inches = inches * 2.54;
  return inches;
}

console.log(incToCm(inches));

// 2. Crear una función que recibe un string y lo convierte en una URL.
// Ej: “pepito” es devuelto como “http://www.pepito.com”
let nombre = prompt("Por favor ingrese el nombre a convertir en URL: ");

function nombreURL(nombre) {
  return `http://www.${nombre}.com`;
}

console.log(nombreURL(nombre));

// 3. Crear una función que recibe un string y devuelve la misma frase pero con
// admiración.
let frase = prompt("Por favor ingrese una frase: ");

function fraseConAdmiracion(frase) {
  return `!${frase}!`;
}

console.log(fraseConAdmiracion(frase));

// 4. Crear una función que calcule la edad de los perros, considerando que 1 año
// para nosotros son 7 de ellos.
let edad = prompt("Por favor ingrese una edad para calcular: ");

function edadPerro(edad) {
  edad = edad * 7;
  return edad;
}

console.log(edadPerro(edad));

// 5. Crear una función que calcule el valor de tu hora de trabajo, introduciendo tu
// sueldo mensual como parámetro.
// PD: considerá que tenes 40 horas semanales, es decir 8hs diarias.

let sueldoMensual = prompt("Por favor ingrese su sueldo mensual: ");

function valorHora(sueldo) {
  let hora = sueldo / 30 / 8;
  return hora;
}

console.log(valorHora(sueldoMensual));

// 2

// 6. Crear la función calculadorIMC() que reciba la altura en metros y el peso en
// kilogramos y calcule el IMC de una persona. Luego, ejecutar la función
// probando diferentes valores.

let peso = prompt("Por favor ingresa tu peso en kg: ");
let altura = prompt("Por favor ingres su altura en mts: ");

function calculadorIMC(peso, altura) {
  let imc;
  imc = peso / (altura * altura);
  return imc;
}

// console.log(calculadorIMC(peso, altura));

// Seleccionar alguna de estas funciones —o de manera opcional, todas— y escribirla
// como función expresada y función flecha.

// ----> Funcion Flecha

let calcularIMC = (peso, altura) => peso / (altura * altura);

// console.log(calcularIMC(peso, altura));

// Funcion Expresada
let calcuIMC = function (peso, altura) {
  let imc = peso / (altura * altura);
  return imc;
};

console.log(calcuIMC(peso, altura));

// Si llegamos hasta este punto estamos más que satisfechos. Ahora te dejamos unos
// ejercicios con una dificultad extra, tendrás que buscar algunos conceptos para poder
// resolverlos. Es una práctica que los programadores realizamos todos los días. Como
// siempre te decimos, una parte importante del aprendizaje en programación es
// ignorar la complejidad, e ir estrictamente a lo que necesitamos. Sabemos que no es
// una práctica fácil de realizar, pero con el tiempo va a ir haciéndose más sencilla y
// divertida.

// 7. Crear una función que recibe un string en minúscula, lo convierta a mayúsculas
// y lo retorne.
// Investigá qué hace el método de strings .toUpperCase()

let palabra = prompt("Por favor ingrese una palabra en minusculas: ");

function enMayusculas(texto) {
  let textoMayuscula = texto.toUpperCase();
  return textoMayuscula;
}

console.log(enMayusculas(palabra));

// 8. Crear una función que recibe un parámetro y devuelve qué tipo de dato es ese
// parámetro.
// Pista: te servirá revisar qué hace la palabra reservada typeof.
let texto = "Esto es un texto";
let numero = 25;

let tipoDeDato = (chequear) => typeof chequear;

console.log(tipoDeDato(texto));
console.log(tipoDeDato(numero));

// 9. Crear una función que le pasamos el radio de un círculo y nos devuelve la
// circunferencia.
// Pista: Investigá si el objeto Math tiene entre sus propiedades el número Pi.

let circuferencia = function (radio) {
  let diametro = radio * 2;
  pi = Math.PI;
  let circuferencia = diametro * pi;
  return circuferencia;
};

console.log(circuferencia(125));
