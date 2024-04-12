// Return the number of vowels in a string

function countVowels(str) {
    // Convert the string to lowercase to handle uppercase vowels
    str = str.toLowerCase();
    // Define an array of vowels
    const vowels = ['a', 'e', 'i', 'o', 'u'];
    // Initialize a variable to store the count of vowels
    let count = 0;
    // Iterate through the characters of the string
    for (let char of str) {
        // Check if the character is a vowel
        if (vowels.includes(char)) {
            count++;
        }
    }
    // Return the count of vowels
    return count;
}

// Example usage:
console.log(countVowels("Hello World"));
console.log(countVowels("Santus Sanitorials"));
console.log(countVowels("citadel"));
