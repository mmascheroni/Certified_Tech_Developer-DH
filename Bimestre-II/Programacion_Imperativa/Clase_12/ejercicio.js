// digitalHouse()
// Creá la función digitalHouse() que recibirá 2 números como parámetros. La función
// deberá imprimir por pantalla los números del 1 al 100, pero teniendo en cuenta los
// siguientes criterios:
// ● Si el número a imprimir es múltiplo del primer parámetro que se ingresó, deberá
// mostrar el string “Digital” en lugar del número.
// ● Si el número a imprimir es múltiplo del segundo parámetro ingresado, deberá
// mostrar el string “House” en su lugar del número.
// ● Si el número a imprimir es múltiplo de ambos

const digitalHouse = (num1, num2) => {
    for (let i = 0; i <= 100; i++) {
        if (i % num1 == 0 && i % num2 == 0) {
            console.log("Digital House");
        } else if (i % num1 == 0) {
            console.log("Digital");
        } else if (i % num2 == 0) {
            console.log("House");
        } else {
            console.log(i);
        }
    }
};

let imprimir1Al100 = digitalHouse(3, 5);
console.log(imprimir1Al100);
