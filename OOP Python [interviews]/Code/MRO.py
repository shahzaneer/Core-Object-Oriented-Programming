class A:
    def show(self):
        print("A")

class B:
    def show(self):
        print("B")

class C(A, B):
    pass

obj = C()
obj.show()


# MRO Calculation:
# C inherits from A and B, so Python first looks in C, then A, and finally B.
# Output: A (because A comes before B in the inheritance list).