class Animal:
    def speak(self):
        return "Animal speaks"

class Dog(Animal):
    def speak(self):
        return "Dog barks"

dog = Dog()
print(dog.speak())  # Output: Dog barks


