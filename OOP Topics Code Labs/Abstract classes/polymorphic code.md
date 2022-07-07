# Polymorphic Code

- The polymorphic code is firstly resolved in the parent and then in the child class.
- If the called behaviour is present in both the classes only then the code will be called to be polymorphic code.

## Early Binding

- The resolving of behaviour in the parent class.

## Late binding

- The resolving of behaviour in the child class.
- it is also known as dynamic binding.

## Casting
```java 
 class Parent{} 
        |
        |
        |
        V 
class Child extends Parent{}

```
## Upcasting

-  Child se parent main janna upcasting
- Type Cast krne ki zarurat nhi! 
- `Employee e = new CommissionEmployee()`

## Downcasting

- Parent se Child main jana is Downcasting
- Type Cast krna Zaruri hai 
``` Java
CommissionEmployee e = new Employee() // Compile Time Error
CommissionEmployee e = (CommissionEmployee) new Employee()
```

## downcasting and upcasting are possible in case of Inheritance only.
