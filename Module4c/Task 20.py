#Create a class called Human

#Add an attribute leg_count with the value of 4

#Add a method called get_gender() that returns "Unknown" in the Human class

#Create another class called Man that extends Human


#Optionally you can instantiate the classes Man and Woman then print out the values of the get_gender() method in each object instance


class Human:
    def __init__(self):
        self.leg_count = 4

    def get_gender(self):
        return "Unknown"

class Man(Human):
    def get_gender(self):
        return "Male"

# Optionally you can instantiate the classes and invoke the get_gender() method
man_instance = Man()
print(f"Gender of man_instance: {man_instance.get_gender()}")  # This will print: Gender of man_instance: Male

# If you want to create a Woman class, you can do it similarly
class Woman(Human):
    def get_gender(self):
        return "Female"

woman_instance = Woman()
print(f"Gender of woman_instance: {woman_instance.get_gender()}")  # This will print: Gender of woman_instance: Female
