const prompt = require("prompt-sync")({ sigint: true });

// Necesitamos armar el sistema para un local de venta de sándwiches. Los clientes
// eligen el sándwich base que tiene un precio y, por cada selección siguiente, se le suma
// el valor de su selección al precio. Por ejemplo, partiendo de un sándwich base
// vegetariano con un precio x, después se selecciona pan negro con un precio y, por lo
// que el total a pagar sería x+y, y así sucesivamente con el resto de los ingredientes.
// Como es un local que ya tenía un sistema previo, ellos ya tienen toda la interfaz
// donde el usuario elige cada ingrediente, lo que nos facilita el trabajo, ya que nosotros
// recibiremos los datos de la siguiente manera.
// Nos llega un string indicando el tipo de sándwich base. Estos tienen un valor base
// diferente por cada selección:
// ● Pollo = $150 (“pollo”)
// ● Carne = $200 (“carne”)
// ● Vegetariano (verduras asadas) = $100 (“veggie”)

// Luego, el sistema pregunta al cliente qué tipo de pan quiere. Tienen para elegir entre
// otras tres opciones, por lo que recibiremos también otro string con el tipo de pan
// deseado:
// ● Blanco c/orégano y parmesano = $50 (“blanco”)
// ● Negro c/avena = $60 (“negro”)
// ● Sin gluten = $75 (“s/gluten”)

// Para finalizar, el sistema avanza preguntando al cliente si quiere los siguientes
// adicionales:
// ● Queso = $20
// ● Tomate = $15
// ● Lechuga = $10
// ● Cebolla = $15
// ● Mayonesa = $5
// ● Mostaza = $5

// Cada uno de estos adicionales están representados por booleanos —es decir, true o
// false—, dependiendo de si aceptan o no cada uno de los adicionales —nos llegan un
// total de seis valores booleanos, uno por cada adicional—.
// Nuestro trabajo es crear una función que reciba estos ocho parámetros —un string
// para el sándwich base, uno para el pan y los seis booleanos de los adicionales—. La
// función deberá consultar primero qué tipo de sándwich base se seleccionó, luego el
// tipo de pan, y por último deberá verificar qué adicionales se seleccionaron.
// Finalmente, deberá retornar el valor numérico del total a pagar del cliente.

//PRECIOS
// let pollo = 150;
// let carne = 250;
// let vegetariano = 100;

// let blanco = 50;
// let negro = 60;
// let sinGluten = 75;

// let queso = 20;
// let tomate = 15;
// let lechuga = 10;
// let cebolla = 15;
// let mayonesa = 5;
// let mostaza = 5;

let sandwichBase = prompt(
  "Por favor, escoge tu sandwich base : 1- Pollo, 2- Carne, 3- Vegetariano: "
);

let pan = prompt(
  "Por favor, escoge el pan : 1- Blanco, 2- Negro, 3- S/gluten "
);

let queso = prompt("Queres agregarle Queso? ");
let tomate = prompt("Queres agregarle Tomate? ");
let lechuga = prompt("Queres agregarle Lechuga? ");
let cebolla = prompt("Queres agregarle Cebolla? ");
let mayonesa = prompt("Queres agregarle Mayonesa? ");
let mostaza = prompt("Queres agregarle Mostaza? ");

function pedido(base, pan, queso, tomate, lechuga, cebolla, mayonesa, mostaza) {
  let total = 0;

  switch (base) {
    case "pollo":
      total += 150;
      break;
    case "carne":
      total += 200;
      break;
    case "viggie":
      total += 100;
      break;
  }

  switch (pan) {
    case "blanco":
      total += 50;
      break;
    case "negro":
      total += 60;
      break;
    case "s/gluten":
      total += 75;
      break;
  }

  if (queso == "true") {
    total += 20;
  }
  if (tomate == "true") {
    total += 15;
  }
  if (lechuga == "true") {
    total += 10;
  }
  if (cebolla == "true") {
    total += 15;
  }
  if (mayonesa == "true") {
    total += 5;
  }
  if (mostaza == "true") {
    total += 5;
  }

  return total;
}

console.log(
  pedido(sandwichBase, pan, queso, tomate, lechuga, cebolla, mayonesa, mostaza)
);
