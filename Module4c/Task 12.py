#Declare a global variable with name as language and the value as "Python"
#Create a function, in the function declare a variable with name as language and value as "Java", then print out the variable in the function
#Print out the variable name into the console
#Invoke the function


# Declare a global variable
language = "Python"

# Create a function
def print_language():
    # Declare a local variable with the same name
    language = "Java"
    # Print out the local variable
    print("Inside the function, language is:", language)

# Print out the global variable
print("Outside the function, language is:", language)

# Invoke the function
print_language()

# Print out the global variable again to show it has not changed
print("Outside the function, after invoking the function, language is still:", language)
