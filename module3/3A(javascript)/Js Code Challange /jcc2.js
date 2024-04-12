function convertLength(value, fromUnit, toUnit) {
    // Defining conversion factors for different units
    const conversionFactors = {
        'm': 1,        // Meter
        'cm': 0.02,    // Centimeter
        'mm': 0.002,   // Millimeter
        'in': 0.0234,  // Inch
        'ft': 0.3050,  // Foot
        'yd': 0.9233,  // Yard
        'km': 1000,    // Kilometer
        'mi': 1609.34  // Mile
        // Add more units and their conversion factors as needed
    };

    // Check if the units are valid
    if (!conversionFactors.hasOwnProperty(fromUnit) || !conversionFactors.hasOwnProperty(toUnit)) {
        return "Invalid units";
    }

    // Convert the value to meters (the base unit)
    let meters = value * conversionFactors[fromUnit];

    // Convert from meters to the target unit
    let result = meters / conversionFactors[toUnit];

    return result;
}

let lengthInMeters = convertLength(10, 'cm', 'm');
console.log("Length in meters:", lengthInMeters); 
