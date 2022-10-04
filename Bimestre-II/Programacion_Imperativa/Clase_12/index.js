const alicia = [10, 80, 75];
const bob = [90, 20, 25];

function encontrarGanador(arr1, arr2) {
    let contadorArr1 = 0;
    let contadorArr2 = 0;

    for (let i = 0; i < arr1.length; i++) {
        if (arr1[i] > arr2[i]) {
            contadorArr1 += 1;
        } else {
            contadorArr2 += 1;
        }
    }

    if (contadorArr1 > contadorArr2) {
        return "Alicia es ganadora con " + contadorArr1 + " puntos";
    } else {
        return "Bob es ganadora con " + contadorArr2 + " puntos";
    }
}

console.log(encontrarGanador(alicia, bob));
