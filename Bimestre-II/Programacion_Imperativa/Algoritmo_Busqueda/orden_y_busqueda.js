let list = [12, 3, 5, 7, 1, 22, 47, 100];

const ordernarArreglo = (arr) => {
    for (let i = 0; i <= arr.length; i++) {
        for (let j = 0; j <= arr.length - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                let temp = arr[j];

                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }

    return arr;
};

let arreglo = ordernarArreglo(list);
console.log(arreglo);

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

let busquedaNumero22 = busquedaBinaria(list, 22);
console.log(busquedaNumero22);

let busquedaNumero47 = busquedaBinaria(list, 47);
console.log(busquedaNumero47);
