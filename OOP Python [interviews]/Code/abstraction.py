from abc import ABC, abstractmethod

class Animal(ABC):
    @abstractmethod
    def speak(self):
        pass

class Dog(Animal):
    def speak(self):
        return "Dog barks"

dog = Dog()
print(dog.speak())  # Output: Dog barks
