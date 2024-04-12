function sortNumbersDescending(arr) {
    // Use the sort method with a custom comparison function to sort the array in descending order
    arr.sort((a, b) => b - a);

    // Return the sorted array
    return arr;
}
let numbersArray = [5, 2, 9, 1, 7];
console.log("Original array:", numbersArray); // Output: Original array: [5, 2, 9, 1, 7]
let sortedArray = sortNumbersDescending(numbersArray);
console.log("Sorted array (descending):", sortedArray); // Output: Sorted array (descending): [9, 7, 5, 2, 1]
