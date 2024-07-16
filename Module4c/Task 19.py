#Create a class called Human
#Add an attribute leg_count with the value of 4
#Add another attribute can_walk with the value of True
#Create a method called get_description, the method should print "This is human"
#Create another method that return the leg count, the name of the method is your choice

#Optionally you can instantiate the class and invoke the method get_description() and invoke your method that returns leg count.

class Human:
    def __init__(self):
        self.leg_count = 4
        self.can_walk = True

    def get_description(self):
        print("This is human")

    def get_leg_count(self):
        return self.leg_count

# Instantiate the class
person = Human()

# Invoke the methods
person.get_description()  # This will print: This is human
print(f"Leg count: {person.get_leg_count()}")  # This will print: Leg count: 4

