# Declare a list with some values
my_list = [5, 3, 8, 1, 2, 9, 7, 4, 6]

# Print the list in the console
print("Original list:")
print(my_list)

# Sort the list
my_list.sort()

# Print the sorted list in the console
print("\nSorted list:")
print(my_list)

# Experiment with other list functions

# Append a value to the list
my_list.append(10)
print("\nList after appending 10:")
print(my_list)

# Remove a value from the list
my_list.remove(3)
print("\nList after removing 3:")
print(my_list)

# Insert a value at a specific index
my_list.insert(2, 15)
print("\nList after inserting 15 at index 2:")
print(my_list)

# Pop a value from the list
popped_value = my_list.pop()
print(f"\nPopped value: {popped_value}")
print("List after popping a value:")
print(my_list)

# Reverse the list
my_list.reverse()
print("\nReversed list:")
print(my_list)

# Get the length of the list
length = len(my_list)
print(f"\nLength of the list: {length}")

# Count the occurrences of a value in the list
count_of_1 = my_list.count(1)
print(f"\nCount of 1 in the list: {count_of_1}")

# Find the index of a value in the list
index_of_8 = my_list.index(8)
print(f"\nIndex of 8 in the list: {index_of_8}")
