const prompt = require("prompt-sync")({ sigint: true });

// Traductor condicional
// Usando la estructura switch, crea un programa en el que si un usuario ingresa "casa",
// "perro", "pelota", "árbol" o "genio", nos devuelva la misma palabra traducida al idioma
// inglés.
// En caso de que la palabra sea distinta a la esperada, mostrarle un mensaje que le
// informe que la palabra ingresada es incorrecta.

let palabra = prompt(
  "Por favor, ingrese la palabra a traducir dentro del rango de palabras: "
);

switch (palabra) {
  case "perro":
    console.log("dog");
    break;

  case "pelota":
    console.log("ball");
    break;

  case "arbol":
    console.log("tree");
    break;

  default:
    console.log("La palabra ingresada es incorrecta!");
}
