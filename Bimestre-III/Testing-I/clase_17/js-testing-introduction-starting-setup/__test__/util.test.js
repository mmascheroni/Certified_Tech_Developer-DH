// const { generateText } = require("../util");

// test("Salida de Nombre y Edad", () => {
//     const text = generateText("Daniel", 30);
//     expect(text).toBe("Daniel (30 years old)");
// });

const { generateText, validateInput, createElement } = require("../util.js");

describe("Pruebas de salida de datos", () => {
    test("Salida con datos", () => {
        const text = generateText("Daniel", 30);
        expect(text).toBe("Daniel (30 years old)");
    });

    test("Salida con datos vacios", () => {
        const text = generateText("", null);
        expect(text).toBe(" (null years old)");
    });

    test("Salida sin datos", () => {
        const text = generateText();
        expect(text).toBe("undefined (undefined years old)");
    });
});

// describe("Pruebas de entrada de datos", () => {
//     const input = validateInput();
// });

/*------------------------------*/
/*      TEST ValidateInput      */
/*------------------------------*/

describe("Validate funtion validateInput() -> Test suites", () => {
    test("validate the input is text an is not empty", () => {
        const e = validateInput("Mauro", false, false);
        expect(e).toBeTruthy();
    });

    test("validate the return value is false becuse is not a text", () => {
        const e = validateInput(false, true, false);
        expect(e).toBeFalsy();
    });

    test("Validate the if not empty", () => {
        const e = validateInput("   ", true, false);
        expect(e).toBeFalsy();
    });

    // test("Validate the text as number", () => {
    //     const e = validateInput(25, true, true);
    //     console.log(e);
    //     expect(e).toBeFalsy();
    // });
});

/*---------------------------*/
/*     TEST HTML (DOM)       */
/*---------------------------*/
//1. Actualizar el const {generateText,createElement} = require('../util.js')
//2. Por favor agregar lo siguiente en su archivo package.json ya que al trabajar con HTML necesitamos una config extra:

// "test": "jest --env=jsdom",
// "test:coverage": "jest --coverage --env=jsdom"

//3. Ejecutar por terminal el siguiente comando: npm install -D jest-environment-jsdom

//4. Por favor agregar estos test a la clase util.test.js para cubrir los de la funcion createElement que es la del HTML:

// describe("Validate Create element", () => {
//     test("Create new element with data", () => {
//         const element = createElement("li", "exampleElement", "user-item");
//         expect(element.textContent).toMatch(/exampleElement/);
//     });
//     test("Create new element without data", () => {
//         const element = createElement(null);
//         expect(element.textContent).toBe("");
//     });
// });
