# Mutation and Mutability
- A class that changes the state of an object is called a mutation class.
- All those class which don't change the state of an object are called immutable classes.
- Example
1. `String Class` is a immutable Class.
2. `StringBuilder` is a mutable Class

# How to make a Class Immutable?
1. Make all the attributes final
2. Make all the attributes private (Encapsulation)
3. Don't make any setter/mutator Method.
4. Remove those functions which return the reference of mutable objects.

# key Point
>1 Mutable Class refers the  `Modifiers`

>2 Immutable Class refers the `Producers`   