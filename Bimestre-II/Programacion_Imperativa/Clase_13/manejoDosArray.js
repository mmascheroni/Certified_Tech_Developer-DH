// Manejando dos arreglos
// Deberás crear una función llamada arrayHandler que reciba dos arreglos de igual largo como parámetros y muestre en la consola “Soy {elemento de array 1} y yo soy {elemento de array 2}”. Ejemplo:
// arrayHandler([1,2,3,4], [“h”,”o”,”l”,”a”]) debe mostrar:
// Soy 1 y yo soy h
// Soy 2 y yo soy o
// Soy 3 y yo soy l
// Soy 4 y yo soy a

function arrayHandler(arr1, arr2) {
    for (let i = 0; i < arr1.length; i++) {
        console.log(
            `Soy ${arr1[i]} del primer arreglo y yo soy ${arr2[i]} del segundo arreglo.`
        );
    }
}

console.log(arrayHandler([1, 2, 3, 4], ["h", "o", "l", "a"]));
