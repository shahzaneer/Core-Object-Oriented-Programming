# Diamond Problem

The **Diamond Problem** occurs in multiple inheritance scenarios when a class inherits from two classes that both inherit from a common base class. This can create ambiguity about which method or property should be inherited from the common base class.

### **Example of the Diamond Problem (in Python)**

```python
class A:
    def show(self):
        print("A's show()")

class B(A):
    def show(self):
        print("B's show()")

class C(A):
    def show(self):
        print("C's show()")

class D(B, C):
    pass

d = D()
d.show()  # Which show() will be called: B's or C's?
```

---

## ✅ **Solutions to the Diamond Problem**

### 1️⃣ **Using Method Resolution Order (MRO) in Python**

- **MRO** defines the order in which classes are searched when calling a method.
- Python uses the **C3 Linearization Algorithm** to handle MRO.

**Solution:**

```python
class A:
    def show(self):
        print("A's show()")

class B(A):
    def show(self):
        print("B's show()")

class C(A):
    def show(self):
        print("C's show()")

class D(B, C):
    pass

d = D()
d.show()               # Output: B's show()
print(D.mro())         # Shows the MRO: [D, B, C, A, object]
```

Here, `D` will first look into `B`, then `C`, and finally `A`. The MRO resolves the ambiguity automatically.

---

### 2️⃣ **Using `super()` to Handle Ambiguity**

- `super()` ensures each class in the hierarchy is initialized only once.

```python
class A:
    def show(self):
        print("A's show()")

class B(A):
    def show(self):
        print("B's show()")
        super().show()

class C(A):
    def show(self):
        print("C's show()")
        super().show()

class D(B, C):
    def show(self):
        print("D's show()")
        super().show()

d = D()
d.show()
```

**Output:**

```
D's show()
B's show()
C's show()
A's show()
```

- `super()` avoids duplication and maintains a clear execution order.

---

### 3️⃣ **Using Interfaces (in Java or C#) to Avoid the Diamond Problem**

Languages like **Java** and **C#** avoid the diamond problem by not supporting multiple inheritance of classes. Instead, they use **interfaces**.

**Java Example:**

```java
interface A {
    default void show() {
        System.out.println("A's show()");
    }
}

interface B extends A {
    default void show() {
        System.out.println("B's show()");
    }
}

interface C extends A {
    default void show() {
        System.out.println("C's show()");
    }
}

class D implements B, C {
    public void show() {
        B.super.show();  // Specify which interface's method to call
    }
}

public class Main {
    public static void main(String[] args) {
        D obj = new D();
        obj.show();
    }
}
```

**Output:**

```
B's show()
```

Here, the ambiguity is resolved explicitly by calling `B.super.show()`.

---

### 4️⃣ **Using Virtual Inheritance (in C++)**

C++ introduces **virtual inheritance** to handle the diamond problem.

```cpp
#include <iostream>
using namespace std;

class A {
public:
    void show() {
        cout << "A's show()" << endl;
    }
};

class B : virtual public A { };
class C : virtual public A { };

class D : public B, public C { };

int main() {
    D obj;
    obj.show();  // No ambiguity
    return 0;
}
```

- **Virtual inheritance** ensures that only one copy of `A` exists in `D`, solving the problem.

---

## **Summary**

| **Language** | **Solution**                    | **Technique**                  |
| ------------ | ------------------------------- | ------------------------------ |
| Python       | Method Resolution Order (MRO)   | C3 Linearization, `super()`    |
| Java         | Interfaces with default methods | Explicit `super` calls         |
| C#           | Interfaces                      | Explicit method implementation |
| C++          | Virtual Inheritance             | `virtual` keyword              |

---
