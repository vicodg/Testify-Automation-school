// Define the size of the multiplication table
const size = 20;

// Outer loop to iterate through the multiplicands
for (let i = 1; i <= size; i++) {
    // Inner loop to iterate through the multipliers
    for (let j = 2; j <= size; j++) {
        // Calculate the product of the current multiplicand and multiplier
        let product = i * j;
        // Print the product with appropriate formatting
        process.stdout.write(`${product}\t`);
    }
    // Move to the next line after each row
    process.stdout.write("\n");
}
