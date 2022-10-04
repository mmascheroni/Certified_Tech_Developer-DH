// Palíndromo
// Deberás crear una función llamada palindromo que indique si una palabra es palíndroma o no. Debe retornar “true” en caso de que lo sea, y “false” en caso de que no. Ejemplo:
// palindromo(“anilina”) debe retornar true
// palindromo(“Ana”) debe retornar true
// palindromo(“Enrique”) debe retornar false

const palindromo = (palabra) => {
    let palabraReverse = palabra.split("").reverse().join("");

    if (palabra.toLowerCase() == palabraReverse.toLowerCase()) {
        return true;
    } else {
        return false;
    }
};

// let palabra = "Mario";
// console.log(palabra.split("").reverse().join(""));

console.log(palindromo("Anilina"));
console.log(palindromo("Ana"));
console.log(palindromo("Enrique"));
