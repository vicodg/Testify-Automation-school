function sortStringsAlphabetically(arr) {
    // Use the sort method to sort the array alphabetically
    arr.sort();

    // Return the sorted array
    return arr;
}

let stringsArray = ["banana", "apple", "orange", "grape"];
console.log("Original array:", stringsArray); 
let sortedArray = sortStringsAlphabetically(stringsArray);
console.log("Sorted array:", sortedArray); 
