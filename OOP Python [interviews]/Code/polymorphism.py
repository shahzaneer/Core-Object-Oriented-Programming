class Animal:
    def speak(self):
        return "Animal makes a sound"

class Dog(Animal):
    def speak(self):
        return "Dog barks"

def animal_sound(animal):
    print(animal.speak())

dog = Dog()
animal_sound(dog)  # Output: Dog barks
