// Loop de impares con palabra
// Deberás crear una función llamada loopDeImpares que reciba como parámetros un número y una palabra, y haga un loop de 0 a 100 mostrando en la consola cada número del loop. Luego, modificar el código para que, en caso de que ese número sumado con el número pasado por parámetro sea impar, muestre en la consola la palabra pasada por parámetro.

const loopDeImpares = (num, palabra) => {
    for (let i = 1; i <= 100; i++) {
        if ((i + num) % 2 != 0) {
            console.log(palabra);
        } else {
            console.log(i);
        }
    }
};

let impares = loopDeImpares(5, "Hola, este numero sumado a 5 es impar.");
