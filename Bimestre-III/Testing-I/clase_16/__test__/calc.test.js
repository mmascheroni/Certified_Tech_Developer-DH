const { suma, resta, multiplicacion, division } = require("../calc.js");

describe("Sum Tests Suites", () => {
    test("Sum 1 + 1 = 2", () => {
        const sum = suma(1, 2);
        expect(sum).toBe(3);
    });

    test("Sum 'a' + 'b' = 0", () => {
        const sum2 = suma("a", "b");
        expect(sum2).toBe(0);
    });

    test("Sum null + 2 = 0", () => {
        const sum3 = suma(null, null);
        expect(sum3).toBe(0);
    });
});

describe("Rest Tests Suites", () => {
    test("Rest 5 - 3 = 2", () => {
        const rest = resta(5, 3);
        expect(rest).toBe(2);
    });

    test("Rest 'a' - 'b' = 0", () => {
        const rest2 = resta("a", "b");
        expect(rest2).toBe(0);
    });
});

describe("Multiply Tests Suites", () => {
    test("Multiply 2 * 2 = 4", () => {
        const mult = multiplicacion(2, 2);
        expect(mult).toBe(4);
    });

    test("Multiply 'a' * 'b' = 0", () => {
        const mult2 = multiplicacion("a", "b");
        expect(mult2).toBe(0);
    });
});

describe("Divide Tests Suites", () => {
    test("Divide 2 / 2 = 1", () => {
        const divide = division(2, 2);
        expect(divide).toBe(1);
    });

    test("Divide 'a' / 'b' = 0", () => {
        const divide2 = division("a", "b");
        expect(divide2).toBe(0);
    });
});
