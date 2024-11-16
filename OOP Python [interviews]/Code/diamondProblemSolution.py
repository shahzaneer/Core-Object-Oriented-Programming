# Diamond Problem and MRO
# When multiple inheritance creates a "diamond problem", Python's MRO ensures that no class is visited twice.

class A:
    def show(self):
        print("A")

class B(A):
    def show(self):
        print("B")

class C(A):
    def show(self):
        print("C")

class D(B, C):
    pass

obj = D()
obj.show()


# MRO Resolution:
# The MRO for D is:

# D -> B -> C -> A -> object
# Output: B (as B is encountered first in the MRO).