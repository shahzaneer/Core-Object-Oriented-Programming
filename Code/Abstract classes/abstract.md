# Abstract Classes

- The Abstract classes are used to define a prototype for its child classes that what they should implement.
- Abstract classes may have abstract and normal methods.
- Every abstract method should be implemented in the child class.
- Properties (instance variables) can be inherited in the child classes.

## Imp Points

- We cannot make instances of abstract classes.
- but instance classes are a type!
- We can call child's construtor for them to make a abstract class's object.

```java
public abstract class Employee{}

public class staff extends Employee{}

// in the runner
Employee e = new staff();

```
