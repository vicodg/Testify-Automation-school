//Create a function that filters out negative numbers

function filterNegativeNumbers(arr) {
    // Use the filter method to filter out negative numbers
    return arr.filter(num => num >= 0);
}

let numbersArray = [8, -2, 14, -1, 2, -7, 0];
console.log("Original array:", numbersArray); 
let filteredArray = filterNegativeNumbers(numbersArray);
console.log("Filtered array:", filteredArray); 
