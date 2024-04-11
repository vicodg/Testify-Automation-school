function calculateSum(numbers) {
    let sum = 0;
    for (let i = 0; i < numbers.length; i++) {
        sum += numbers[i];
    }
    return sum;
}

// Example usage:
let numbers = [7, 2, 6, 4, 8];
let sum = calculateSum(numbers);
console.log("The sum of numbers is:", sum); 
