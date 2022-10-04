/**
 * Escribir una función que dado un número de mes
 * devuelva la cantidad de días de ese mes
 * (suponiendo que no es un año bisiesto).
 *
 * Por ejemplo, si invocamos la función:
 *
 * diasDelMes(1);
 *
 * Esta debera retornar el numero 31,
 * ya que Enero tiene 31 dias.
 */

// let valores = [1, 2, 3, 4];
// let uno = 1;
// console.log(uno in valores);

// Escribe tu función aquí:
function diasDelMes(numeroMes) {
    let mesLargo = [1, 3, 5, 7, 8, 10, 12];
    let mesCorto = [4, 6, 9, 11];
    let febrero = [2];
    let dias = 0;

    if (mesLargo.includes(numeroMes)) {
        console.log(31);
    } else if (mesCorto.includes(numeroMes)) {
        console.log(30);
    } else if (febrero.includes(numeroMes)) {
        console.log(28);
    }
}

// E invocala:
diasDelMes(1);
diasDelMes(3);
diasDelMes(11);
diasDelMes(9);
diasDelMes(2);
// Por ahora, la función retorna 0.
// Modifica el codigo para que retorne
// los datos correctos.
