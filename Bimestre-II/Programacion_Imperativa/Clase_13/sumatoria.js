// Sumatoria
// Deberás crear una función llamada sumatoria que reciba un número como parámetro y que devuelva la sumatoria de todos sus números anteriores, incluso ese mismo. Ejemplo:
// sumatoria(3) debe retornar 6 porque hace (1+2+3)
// sumatoria(8) debe retornar 36

const sumatoria = (num) => {
    let sumatoria = 0;
    for (let i = 1; i <= num; i++) {
        sumatoria += i;
    }

    return sumatoria;
};

let sumatoriaDe3 = sumatoria(3);
console.log(sumatoriaDe3); // 6

let sumatoriaDe8 = sumatoria(8);
console.log(sumatoriaDe8); // 36
