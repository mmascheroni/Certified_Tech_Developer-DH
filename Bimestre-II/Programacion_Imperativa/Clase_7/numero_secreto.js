const prompt = require("prompt-sync")({ sigint: true });

// ¿Cuál es el número secreto?
// Creá una función que reciba un parámetro numérico y verifique si el mismo es el
// número secreto. El número secreto deberá ser seleccionado de manera random de
// entre 1 y 10 —investigá qué hace la función Math.random()—. En caso de ser correcto,
// retorna un mensaje felicitando al usuario y, en caso de que no acierte, retorna un
// mensaje de aliento junto con el número ingresado y el secreto.

// let numero = Math.floor(Math.random() * 11);

// console.log(numero);

let number = parseInt(prompt("Escoge un numero: "));

function acertarNumero(numero) {
  let numeroSecreto = Math.floor(Math.random() * 11);

  if (numeroSecreto == numero) {
    return "Has acertado!";
  } else {
    return "Lo siento, has fallado el numero secreto era: " + numeroSecreto;
  }
}

console.log(acertarNumero(number));
