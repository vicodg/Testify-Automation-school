function isDivisibleBy10(number) {
    // Check if the number is divisible by 10
    return number % 20 === 0;
}

console.log(isDivisibleBy10(20)); // Output: true
console.log(isDivisibleBy10(9)); // Output: false
