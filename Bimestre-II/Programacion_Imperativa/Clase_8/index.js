// 1) Crear una función que pida un valor por parámetro y muestre los 10
// números siguientes.

function numerosDiezSiguientes(num) {
    for (let i = 1; i < 11; i++) {
        num += 1;
        console.log(num);
    }
}

// numerosDiezSiguientes(10);

// 2) Imprimir los números entre el 5 y el 20, saltando de tres en tres.

for (let i = 5; i <= 20; i += 3) {
    // console.log(i);
    // i += 2;
}

// 3) Escribir un programa que muestre la sumatoria de todos los números
// entre el 0 y el 100

let sumatoria = 0;
for (let i = 0; i <= 100; i++) {
    console.log(i);
    sumatoria += i;
    console.log(sumatoria);
}

// 4) Dado un número entero positivo, mostrar su factorial. El factorial de
// un número se obtiene multiplicando todos los números enteros
// positivos que hay entre el 1 y ese número.

function factorial(num) {
    let contador = 1;
    for (let i = 1; i <= num; i++) {
        contador = contador * i;
    }
    return console.log(contador);
}

// factorial(3);
// factorial(4);

// 5) Crear una función que muestre todos los números de la secuencia de
// fibonacci hasta el valor ingresado por parámetro.

function secuenciaFibonacci(num) {
    let secuencia = [0, 1];
    for (let i = 2; i <= num; i++) {
        secuencia[i] = secuencia[i - 1] + secuencia[i - 2];
    }
    return console.log(secuencia);
}

// secuenciaFibonacci(5);
// secuenciaFibonacci(16);
