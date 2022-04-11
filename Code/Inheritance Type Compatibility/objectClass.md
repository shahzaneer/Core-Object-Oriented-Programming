# Object Class
- It is the parent class of all the classes in java
- Its a built-in Class
- All the methods that you see while using dot operator with class objects which are not present in your class are object class methods!
- they are used to special structure to all java classes.
- Some Examples of Object class Methods are `equals()` and `toString()`. They are overriden before we use them.
# Type Compatibility
- It is defined as the assignment of one data type (class object) to other data type (class Object) when there exists `is a relationship` between both of them. 
```java
public class Father {}
public class Son extends Father{}
Son s = new Father();
// This is Possible in case of is a relation only
```