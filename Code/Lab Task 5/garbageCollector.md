# Garbage Collector
- When an object is of no use it should be destoryed so that the memory should be free for other variables to be used.
- Java has an automatic Garbage Collector
- We can use manually by assigning NULL to the reference variable of an object.

```java
public class ABC{
    public static void main(String [] args){
        Rectangle r1 = new Rectangle(); // r1 is assigned the memory address of object/class Rectangle type.
        r1 = NULL; // r1 is no more accessible that is the memory is freed.
        // this is normally done by java itself when it calls the finalize(); method.
    }
}
```