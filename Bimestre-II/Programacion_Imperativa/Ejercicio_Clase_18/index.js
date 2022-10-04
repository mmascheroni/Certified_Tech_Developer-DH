// Ejercicio
// Se está realizando el desarrollo de una aplicación para control de gastos. Cada día, el usuario ingresa sus gastos cotidianos.
// La idea es solo registrar el total de los gastos, al finalizar la jornada.
// Para simplificar, vamos a considerar que todos los meses tienen cuatro semanas.
// Los gastos estarán en una matriz de 4x7, cada fila representa una semana y cada columna un día. Es decir fila 0, semana 1, fila 1, semana 2, etc. Columna 0, dia 1, columna 1, dia 2, etcétera.
// a)  Lo que nos solicitan es dar el total de gastos en una semana. Recordemos que cada fila representa una semana, es decir, si nos indican semana 2 tenemos que sumar la fila 1 de la matriz. Recordar que las matrices comienzan siempre en posición 0.
// b) La aplicación también tendrá una parte de estadísticas, para esto nos solicitan dar el total de un día en particular, por ejemplo del día 3, acá también tengamos en cuenta lo que ocurre con las filas, ya que las columnas también comienzan en 0.
// c) Por último, es necesario tener el total de gastos realizados en el mes.
// Pregunta para pensar, ¿es lo mismo recorrer por filas o por columnas para resolver este último punto?

let gastos = [
    [250, 695, 800, 1400, 900, 2500, 100],
    [25, 69, 80, 140, 90, 250, 1000],
    [2502, 1695, 800, 1400, 400, 250, 500],
    [252, 695, 80, 400, 1900, 2500, 450],
];

// Calcular el gasto total de la semana 3

// let semanaTres = 0;
// for (let i = 0; i < gastos[2].length; i++) {
//     semanaTres += gastos[2][i];
// }
// console.log(semanaTres);

function calculoSemana(arr, semana) {
    let sem = 0;
    sem = semana - 1;
    let gastoSemanal = 0;

    for (let i = 0; i < arr[sem].length; i++) {
        gastoSemanal += arr[sem][i];
    }

    return gastoSemanal;
}

console.log(calculoSemana(gastos, 2));
console.log(calculoSemana(gastos, 3));
