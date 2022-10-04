/**
 * Escribir una función de JavaScript que invierta
 * un número. Por ejemplo, si x = 32443,
 * la salida debería ser 34423.
 */

let x = 32443;
// let str = x.toString();

// console.log(str.split("").reverse().join(""));

function invertir(num) {
    let str = num.toString();
    return str.split("").reverse().join("");
}

console.log(invertir(x));
