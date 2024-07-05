#Create a function that prints out "Hello World"
#Invoke the same function in it own body
#Invoke the function outside the function block

#Take note of the function invoke and put the Python whitespace rule in mind


# Create a function that prints out "Hello World"
def print_hello_world():
    print("Hello World")
    # Invoke the same function in its own body
    print_hello_world()  # This will cause infinite recursion

# Invoke the function outside the function block
# Commented out to prevent infinite recursion during execution
# print_hello_world()

# To safely demonstrate the function without infinite recursion,
# we will modify the function to only invoke itself a limited number of times:

#  limit to prevent infinite recursion

def print_hello_world_limited(times):
    if times > 0:
        print("Hello World")
        print_hello_world_limited(times - 1)

# Invoke the function outside the function block with a limit
print_hello_world_limited(1)  # Change the number to limit the recursion depth
