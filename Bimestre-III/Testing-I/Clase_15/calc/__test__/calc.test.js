const { suma, resta, multiplicacion, division } = require("../calc.js");

describe("SUM Test Suites", () => {
    test("Verify the sum 1 + 2 to be equals 3", () => {
        const sumOne = suma(1, 2);
        expect(sumOne).toBe(3);
    });

    test("Verify the sum 1 + 3 not to be equals 3", () => {
        const sumTwo = suma(1, 3);
        expect(sumTwo).toBe(3);
    });
});

describe("SUBTRACT Test Suites", () => {
    test("Verify the subtract 5 - 2 to be equals 3", () => {
        const subtractOne = resta(5, 2);
        expect(subtractOne).toBe(3);
    });

    test("Verify the subtract 6 - 3 not to be equals 2", () => {
        const subtractTwo = resta(6, 3);
        expect(subtractTwo).toBe(2);
    });
});
