# Encapsulation:

# Controlled access to variables and methods using public, private, or protected attributes.
# Python uses naming conventions to indicate access levels:
# _variable for protected.
# __variable for private (name mangling applies).

class BankAccount:
    def __init__(self):
        self.__balance = 0  # Private attribute

    def deposit(self, amount):
        self.__balance += amount

    def get_balance(self):
        return self.__balance

account = BankAccount()
account.deposit(100)
print(account.get_balance())  # Output: 100
