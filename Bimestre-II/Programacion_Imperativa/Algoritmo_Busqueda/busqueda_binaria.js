let list = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11];

// Utilizar el algoritmo de búsqueda binaria para responder los siguientes ítems:
// ¿Cuál es la posición del número 2?
// ¿Cuál es la posición del número 5?
// ¿Cuál es la posición del número 8?

const busquedaBinaria = (list, item) => {
    let inicio = 0;

    let final = list.length - 1;

    while (inicio <= final) {
        const mid = Math.floor((inicio + final) / 2);

        const guess = list[mid];

        if (guess == item) {
            return mid;
        }

        if (guess > item) {
            final = mid - 1;
        } else {
            inicio = mid + 1;
        }
    }

    return null;
};

let busquedaNumeroCinco = busquedaBinaria(list, 5);
console.log(busquedaNumeroCinco);
let busquedaNumeroOcho = busquedaBinaria(list, 8);
console.log(busquedaNumeroOcho);
let busquedaNumeroDos = busquedaBinaria(list, 2);
console.log(busquedaNumeroDos);
