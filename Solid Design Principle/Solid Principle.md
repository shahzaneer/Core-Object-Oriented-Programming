# Solid Principle

## `S` --> Single Responsibility Principle

```java
Every class will Perform its specific Duty!
You can perform two tasks in a single class but this is not a good practice!

```

## `O` --> Open Closed Principle

```java
The classes or entities are open for extensions (inheritance) but are closed for modifications!
The Modification can result in serious problems in code! Therefore it should be avoided!
```

## `L` --> Liskov Substitution Principle

```java
LSP says that the child object of its parent should be able to 100% subsitute or replace its parent object without changing the rest of the code
If you don't do this Your class will be inherited. But its not a good practice
You can use Abstract classes or interfaces to implement this.

```

## `I` --> Interface Segregation Principle

```java
A Client should never be forced to implement an interface that it doesn't use or clients shouldn't be forced to depend on methods they do not use!
for resolving such issues, split the interfaces for common use.


```

## `D` --> Dependency Inversion Principle

```java
High level Modules should not depend on low level modules. Both should depend on Abstraction!
The interaction between high and low level Modules should be used via Interfaces and should not be used directly!
```
