### 🏗️ **Composition Over Inheritance: Why & When?**

---

### ✅ **1️⃣ Why Prefer Composition Over Inheritance?**

**Composition** is the design principle of building complex objects by combining simpler, reusable components, rather than relying heavily on class hierarchies.

#### 🚀 **Advantages of Composition:**

1. **Flexibility & Reusability**

   - You can change behavior at runtime by swapping components.
   - Promotes **loose coupling**, making code easier to maintain.

2. **Avoids Inheritance Pitfalls**

   - Inheritance creates **tight coupling** between parent and child classes, making changes risky.
   - Inheritance issues like the **fragile base class problem** and **diamond problem** are avoided.

3. **Better Encapsulation**

   - Internal implementation details are hidden.
   - You expose behavior through well-defined interfaces.

4. **Supports Multiple Behaviors**
   - With composition, an object can have multiple behaviors without the complexity of multiple inheritance.

---

### ✅ **2️⃣ Example: Inheritance vs. Composition**

#### ❌ **Using Inheritance:**

```python
class Engine:
    def start(self):
        print("Engine started.")

class Car(Engine):  # Car inherits from Engine
    def drive(self):
        print("Car is driving.")

car = Car()
car.start()  # Inherited behavior
car.drive()
```

- **Problem:**
  - This implies **"Car _is-a_ Engine"**, which isn’t conceptually accurate.
  - What if we want to replace the engine with a different type? It becomes rigid.

---

#### ✅ **Using Composition:**

```python
class Engine:
    def start(self):
        print("Engine started.")

class Car:
    def __init__(self, engine):
        self.engine = engine  # Car *has-a* Engine

    def drive(self):
        self.engine.start()   # Delegating behavior
        print("Car is driving.")

engine = Engine()
car = Car(engine)
car.drive()
```

- **Benefits:**
  - **"Car _has-a_ Engine"** is a more accurate relationship.
  - Easy to swap engines without changing the `Car` class.
  - Promotes better modularity.

---

### 🏆 **3️⃣ When to Prefer Inheritance?**

While composition is often preferred, **inheritance is still useful** when:

1. **IS-A Relationship (Strong Hierarchy):**

   - Use inheritance when the child is a **specialized version** of the parent.
   - Example: `Dog` **is-a** `Animal`, `Button` **is-a** `UIComponent`.

2. **Reusing Code with Minimal Changes:**

   - If subclasses don’t need to modify much of the inherited behavior.

3. **Frameworks & Libraries:**
   - GUI frameworks, ORMs, and game engines often rely on inheritance for event handling and callbacks.

#### 🚀 **Example: When Inheritance is OK**

```python
class Animal:
    def speak(self):
        print("Animal speaks.")

class Dog(Animal):
    def speak(self):
        print("Dog barks.")

dog = Dog()
dog.speak()  # Inheritance makes sense: Dog is an Animal
```

---

### 🔑 **4️⃣ Summary: Inheritance vs. Composition**

| **Aspect**              | **Inheritance**                            | **Composition**                                |
| ----------------------- | ------------------------------------------ | ---------------------------------------------- |
| **Relationship**        | **IS-A** (e.g., Dog is an Animal)          | **HAS-A** (e.g., Car has an Engine)            |
| **Coupling**            | Tight coupling                             | Loose coupling                                 |
| **Flexibility**         | Rigid; hard to modify behavior             | Flexible; easy to change behavior              |
| **Reusability**         | Hard to reuse across unrelated hierarchies | Easy to reuse components in different contexts |
| **Runtime Changes**     | Not dynamic                                | Behavior can be changed at runtime             |
| **Complex Hierarchies** | Prone to diamond problem, fragile base     | No such issues                                 |

---

### 🧠 **Rule of Thumb:**

- Use **composition** when you need flexibility and modularity.
- Use **inheritance** when there’s a **clear hierarchical relationship** (IS-A).
