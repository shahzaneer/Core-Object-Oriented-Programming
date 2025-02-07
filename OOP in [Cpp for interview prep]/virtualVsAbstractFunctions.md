### 🚀 **Difference Between Virtual Function and Abstract Function**

| **Aspect**             | **Virtual Function**                                                                                                 | **Abstract Function (Pure Virtual Function in C++)**                                              |
| ---------------------- | -------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| **Definition**         | A function that can be overridden in a derived class.                                                                | A function with no implementation in the base class; must be overridden.                          |
| **Implementation**     | Can have a body (implementation) in the base class.                                                                  | Cannot have a body; it's just a declaration.                                                      |
| **Purpose**            | Supports **polymorphism**, allowing dynamic method binding.                                                          | Provides a blueprint for derived classes, enforcing implementation.                               |
| **Usage**              | Optional to override in the derived class.                                                                           | **Mandatory** to override in the derived class.                                                   |
| **Instantiation**      | Base class can be instantiated even if it has virtual functions.                                                     | A class with an abstract function is called an **abstract class** and **cannot be instantiated**. |
| **C++ Syntax**         | `virtual void show() {}`                                                                                             | `virtual void show() = 0;` (Pure Virtual Function)                                                |
| **Java/C# Equivalent** | Methods marked with `virtual` (C#) or regular methods in Java (since all non-static methods are virtual by default). | Declared using the `abstract` keyword in Java/C#.                                                 |

---

### ✅ **1️⃣ Virtual Function Example (C++)**

```cpp
#include <iostream>
using namespace std;

class Base {
public:
    virtual void show() {
        cout << "Base class show()" << endl;
    }
};

class Derived : public Base {
public:
    void show() override {
        cout << "Derived class show()" << endl;
    }
};

int main() {
    Base* b = new Derived();
    b->show();  // Calls Derived's show() due to dynamic polymorphism
    return 0;
}
```

**Output:**

```
Derived class show()
```

- **Key Point:** The base class provides an implementation, and overriding in the derived class is optional.

---

### ✅ **2️⃣ Abstract Function Example (C++)**

```cpp
#include <iostream>
using namespace std;

class Base {
public:
    virtual void show() = 0;  // Pure virtual function (abstract)
};

class Derived : public Base {
public:
    void show() override {
        cout << "Derived class show()" << endl;
    }
};

int main() {
    // Base b;          // ❌ Error: Cannot instantiate an abstract class
    Derived d;          // ✅ OK
    d.show();           // Calls Derived's implementation
    return 0;
}
```

**Output:**

```
Derived class show()
```

- **Key Point:** The `Base` class **cannot be instantiated** because it contains a pure virtual function.

---

### 🚀 **In Java**

- **Virtual Functions:** All non-static methods are virtual by default.

```java
class Base {
    void show() {
        System.out.println("Base class show()");
    }
}

class Derived extends Base {
    @Override
    void show() {
        System.out.println("Derived class show()");
    }
}

public class Main {
    public static void main(String[] args) {
        Base obj = new Derived();
        obj.show();  // Calls Derived's show() (Polymorphism)
    }
}
```

---

- **Abstract Function:**

```java
abstract class Base {
    abstract void show();  // Abstract method
}

class Derived extends Base {
    @Override
    void show() {
        System.out.println("Derived class show()");
    }
}

public class Main {
    public static void main(String[] args) {
        // Base obj = new Base();   // ❌ Error: Cannot instantiate the abstract class
        Derived obj = new Derived(); // ✅ OK
        obj.show();
    }
}
```

---

### 🔑 **Summary of Key Differences**

- **Virtual Function:** Can have an implementation. Overriding is optional.
- **Abstract Function:** Cannot have an implementation. Overriding is **mandatory**.
