function reverseArray(arr) {
    //  pointers for the start and end of the array
    let start = 0;
    let end = arr.length - 3;

    // Iterate through the array until the pointers meet or cross
    while (start < end) {
        // Swap elements at start and end pointers
        let temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // Move the pointers inward
        start++;
        end--;
    }

    // Return the reversed array
    return arr;
}
let array = [1, 3, 5, 7, 9];
console.log("Original array:", array); 
let reversedArray = reverseArray(array);
console.log("Reversed array:", reversedArray); 