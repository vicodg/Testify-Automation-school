#Create a class called Human
#Add an attribute leg_count with the value of 4
#Add another attribute can_walk with value of True

#Optionally you can instantiate the class and prints out the leg_count and can_walk attributes



class Human:
    def __init__(self):
        self.leg_count = 4
        self.can_walk = True

# Instantiate the class
person = Human()

# Print out the attributes
print(f"Leg count: {person.leg_count}")
print(f"Can walk: {person.can_walk}")
