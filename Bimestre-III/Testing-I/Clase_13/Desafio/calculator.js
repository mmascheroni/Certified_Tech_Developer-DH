// Functions

function sum(a, b) {
    return a + b;
}

function subtract(a, b) {
    return a - b;
}

function multiply(a, b) {
    return a * b;
}

function divide(a, b) {
    return a / b;
}

function calculate(num1, num2, operation) {
    if (typeof operation != "string") {
        return "The operation can't be a boolean or number";
    }
    if (isNaN(num1) || isNaN(num2)) return `Only can ${operation} with numbers`;
    if (operation.toLowerCase() === "sum") {
        return sum(num1, num2);
    }
    if (operation.toLowerCase() === "subtract") {
        return subtract(num1, num2);
    }
    if (operation.toLowerCase() === "multiply") {
        return multiply(num1, num2);
    }
    if (operation.toLowerCase() === "divide") {
        return divide(num1, num2);
    } else {
        return `The ${operation} isn't a valid operation`;
    }
}

console.log(calculate(1, 2, "true"));

// SUM
console.log(calculate(1, 2, "Sum"));
console.log(calculate("a", 2, "Sum"));

// SUBTRACT
console.log(calculate(1, 2, "Subtract"));
console.log(calculate("a", 2, "Subtract"));

//MULTIPLY
console.log(calculate(1, 2, "Multiply"));
console.log(calculate("a", 2, "Multiply"));

//Divide
console.log(calculate(1, 2, "Divide"));
console.log(calculate("a", 2, "Divide"));
// console.log(calculate(false, 2, "Divide"));

// invalid operation
console.log(calculate(1, 2, "invalid"));
console.log(calculate(1, 2, 3));
console.log(calculate(1, 2, true));
