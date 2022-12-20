const { generateText } = require("../util");

test("Verify output Name (X years old)", () => {
    const output = generateText("Mauro", "25");
    expect(output).toBe("Mauro (25 years old)");
    console.log(output);
});
