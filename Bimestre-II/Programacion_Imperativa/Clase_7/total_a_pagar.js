const prompt = require("prompt-sync")({ sigint: true });

// totalAPagar()
// Declará una función llamada totalAPagar() que reciba como parámetros: vehiculo y
// litrosConsumidos.
// A continuación, definí y realizá los cálculos para obtener el total a pagar, teniendo en
// cuenta las siguientes consideraciones:
// ● Si el vehículo es “coche”, el precio por litro es de $86.
// ● Si es “moto”, ha de ser $70.
// ● Si es “autobús”, ha de ser $55.
// ● Si los litros consumidos están entre 0 y 25, se ha de añadir $50 al total a pagar.
// ● Si los litros consumidos son mayor a 25, se ha de añadir $25 al total a pagar.

function totalAPagar(vehiculo, litrosConsumidos) {
  let precioLitro;
  if (vehiculo == "coche") {
    precioLitro = 86;
    total = precioLitro * litrosConsumidos;
    if (litrosConsumidos >= 0 && litrosConsumidos <= 25) {
      total += 50;
    } else if (litrosConsumidos > 25) {
      total += 25;
    }
    return total;
  } else if (vehiculo == "moto") {
    precioLitro = 70;
    total = precioLitro * litrosConsumidos;
    if (litrosConsumidos >= 0 && litrosConsumidos <= 25) {
      total += 50;
    } else if (litrosConsumidos > 25) {
      total += 25;
    }
    return total;
  } else if (vehiculo == "autobus") {
    precioLitro = 55;
    total = precioLitro * litrosConsumidos;
    if (litrosConsumidos >= 0 && litrosConsumidos <= 25) {
      total += 50;
    } else if (litrosConsumidos > 25) {
      total += 25;
    }
    return total;
  }
}

// console.log(totalAPagar("coche", 20));
// console.log(totalAPagar("coche", 26));
// console.log(totalAPagar("moto", 20));
// console.log(totalAPagar("moto", 26));
// console.log(totalAPagar("autobus", 20));
// console.log(totalAPagar("autobus", 26));
