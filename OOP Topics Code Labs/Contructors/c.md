# Constructor
- Constructor is a special function and it has the same name as of class. 
- It does not have a return type.
- It is also called the default constructor as it is made by the compiler itself.
- It returns the object.
- for instance if `Result` is a class and we make `Result r1 = new Result();` is a default constructor.
- default constructor jo hai wo java khud bana deta hai state of variables at
- we can customize the default state of variables of our class using constructor.
- The body of the constructor can be used for initializing the state of the object.
- Constructor can be overloaded as well. one constructor that is formed by default will be called the default constructor and the other will be your own constructor.
- jb bhi object create hota hai tou tamaam variables k liay memory mukhtas hojati hai. ager koi object overloaded constructor se initialized hua hai tou wo default ki values nhi lega.
- We can write a lot of overloaded constructors in our class.
- > Constructor ka kaam hai mehiz 'class object' ko return krna aur dataa members ki values ki state ko set krna.
- Constructor is body main mehiz data initialization hi hoti hai. dusre operations nhi krne ismay.
- aik object aik hi constructor se initialized hoga.
- >Contructor is necessary to make an object. iske bagair object hi na banega!
- >jb hum aik bhi overloaded constructor bana lete hain tou compiler default constructor nhi daalega!
- Constructor overloading is done to provide client side program flexibility.
 ``` java
Result r1 = new Result();
// yahan Result class name hai .
// r1 is the object.
// new keyword is used for new memory allocation.
//Result(); aik constructor hai jo return krta hai object. jo r1 main chala jayega.

  ```

- New data members add krne se state per direct effect perta hai we have to get things in arguments or by maintaining good logic by using helper functions.


## This keyword
 - It is used when we use same variable names for the instance variables and local variables.
 - This keywords is a reference variable to the current object.
