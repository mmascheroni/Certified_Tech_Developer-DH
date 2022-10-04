const prompt = require("prompt-sync")({ sigint: true });

// Sin repetirte, modificá tu código de forma tal que cumpla con estas consignas:
// ● Si la edad es negativa, que se muestre en la consola este mensaje: "Error, edad
// inválida. Por favor ingrese un número válido."
// Importante: no se deberá mostrar ningún otro mensaje.
// ● Si tiene 21 años, además de darle la bienvenida, felicitarlo por haber llegado a
// la mayoría de edad.
// ● Si su edad es impar, decirle en cualquiera de los mensajes: "¿Sabías que tu
// edad es impar?".

let edad = parseInt(prompt("Por favor, ingrese su edad: "));

while (true) {
  if (edad % 2 != 0 && edad > 0 && edad < 18) {
    console.log("No puede pasar al bar.");
    console.log("Sabias que tu edad es impar");
    break;
  } else if (edad % 2 != 0 && edad > 0 && edad < 21) {
    console.log("Puede pasar al bar, pero no puede tomar alcohol.");
    console.log("Sabias que tu edad es impar");
    break;
  } else if (edad == 21) {
    console.log("Puede pasar al bar, y beber");
    console.log("Felicitaciones por haber llegado a la mayoria de edad.");
    console.log("Sabias que tu edad es impar");
    break;
  } else if (edad % 2 != 0 && edad >= 22) {
    console.log("Puede pasar al bar, y beber");
    console.log("Sabias que tu edad es impar");
    break;
  } else if (edad > 0 && edad < 18) {
    console.log("No puede pasar al bar.");
    break;
  } else if (edad > 0 && edad < 21) {
    console.log("Puede pasar al bar, pero no puede tomar alcohol.");
    break;
  } else if (edad >= 22) {
    console.log("Puede pasar al bar, y beber");
    break;
  } else {
    console.log("Error, edad inválida. Por favor ingrese un número válido.");
    edad = parseInt(prompt("Por favor, ingrese su edad: "));
  }
}
