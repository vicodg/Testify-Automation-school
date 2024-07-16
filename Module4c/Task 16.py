#Declare a dictionary with any key-value pair of items/elements
#Print the dictionary in console
#Update the dictionary with two different key-value pair items
#Print the dictionary in console again

animal = {
   "bird": "goat",
   "dog" : "cat",
}

print( "dictionary", animal)


#Declare a dictionary with any key-value pair of items/elements

animals_key= animal.items()
print( "Keys",animals_key )


#Update the dictionary with two different key-value pair items

animal.update({"dog" : "snake"})
animal.update({"cat" : "lion"})
print("Update" , animal )



