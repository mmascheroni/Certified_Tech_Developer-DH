// Metodo de Ordenacion Bubble Sort

let numbers = [4, 2, 3, 1, 10, 5, 9, 6, 20, 15, 12, 11, 14];

let letters = ["Z", "F", "A", "B", "B"];

function bubbleSort(arr) {
    for (let i = 0; i < arr.length; i++) {
        for (let j = 0; j < arr.length - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                let temp = arr[j];

                arr[j] = arr[j + 1];

                arr[j + 1] = temp;
            }
        }
    }

    return console.log(arr);
}

bubbleSort(numbers);
bubbleSort(letters);
