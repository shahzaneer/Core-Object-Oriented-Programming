# Unified Modeling Language

- Commonly Known as `UML`
- Visual Language
- used to `visualize` the system designs for `Software Developement`

## Definition

- A `UML diagram` is a diagram based on the UML (Unified Modeling Language) with the purpose of visually representing a system along with its main actors, roles, actions, artifacts or classes, in order to better understand, alter, maintain, or document information about the system

# Why UML?

- Visualization gives a better insight of the System Design needed to implement.
- `A picture worths a Thousand Words` is the motviation for UML Diagrams
- It helps Non Coders and Coders to work simultaneously on a project

# Types

- There are dozens of types of UML but with the perspective of OOP we will go through `Class Diagram` and `object Diagram` in detail

# Structure Diagram

- `Class Diagram` and `object Diagram` both comes under the umberlla of Structure Diagrams

# Class Diagram

## Overview

- Static view or Object oriented view of Class is given.
- it consists of a box of three layers.
- first consists of the class Name
- Second of Attributes/properties/fields
- third of Behaviours/fuinctions/operation
- Their return type is written with a colon preceding them
- The visibility signs are :
- `+` for `Public`
- `-` for `private`
- `#` for `Protected`
- `~` FOR `package access`

## Relationships

### `Association`

- it shows the static relationship between the two or more classes
- it uses a single line to reperesent it.

### `Dependency`

- it shows the dependency of one class on other class
- it uses a dotted line with a arrow on the class on which other class is dependent.

### `Aggregation`

- it depicts the `has a relationship` with not a strong relationship
- Example is `Library` and `Book`. If the library is destroyed the books will be there, and no change will be shown
- Library is the aggregation of Books
- it is represented by a line and a diamond (hollow).
- The diamond is on the whole part!

### `Composition`

- it shows the `has a relationship` with a very strong relationship
- The contained class depends upon the container class.
- Example is of `Bag` and `stationary` in it.
- if bag is destroyed stationary is also no more available.
- it is also represented by a line and a diamond (filled/ colored).
- The diamond is on the whole part!

### `Generalization`

- it portrays the `is a relationship` -> Inheritance
- when you move upward (upcasting of classes)
- it is represented by a closed arrow (hollow)
- the arrow is on the parent class
- if the classes are more than one then the linking between them is association (represented by single line)

### `Specialization`

- it shows off the `is a relationship` -> Inheritance
- when you move downward (downcasting of classes)
- it is represented by a closed arrow (hollow)
- the arrow is on the specialized child class

# Object Diagram

- it shows the screenshot of the current state of the instance of a class or more than one class and shows the relationship between them.
- it is represented by two blocks in a box
- the first one shows the `ObjectName : ClassName` with a line under it.
- the second one shows the `current values of attributes` with the `visibility operators` as shown above.
