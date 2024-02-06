# Design Patterns

1. [SOLID](#solid)
2. [Pattern Types](#pattern-types)
3. Creational Patterns
   - [Singleton](#singleton)
   - [Builder](#builder)
   - [Prototype](#prototype)
   - [Factory Method](#factory-method)
   - [Abstract Factory](#abstract-factory)


## SOLID

1. **Single Responsibility** Principle - there should be one and only one reason for a class to change. To check this principle we can answer the question - what is class supposed to do and what exactly it is doing right now.
2. **Open Closed** Principle - classes should be open for extensions but closed for modifications. In other words, we should be able to extend existing behaviour but existing code remains unchanhed.
3. **Liskov Substitution** Principle - replacing base class objects with child class objects should not alter the program behavior.
4. **Interface Segregation** Principle - clients should not be forced to implement the functionalities that they do not require. In other words, it is better to have many interfaces specific to different requirements instead of creating only one general interface.
5. **Dependency Inversion** Principle - high level modules should _not_ depend on low level modules. Both should depend on abstractions.


## Pattern Types

1. **Creational Patterns** - deal with the process of creation of objects of classes.
2. **Structural Patterns** -
3. **Behavioural Patterns** - 


## Singleton
**Purpose** - ensure that a class has only one instance.

**When**:
   - a class in a program should have just a single instance available to all clients (for example, service to work with db)

**Implementation**:
   - _in general_: private constructor + attribute to tracking instance + public static method to get instance
   - _eager initialization_: initialize instance as soon as class loaded
   - _lazy initialization with double chancked locking_: initialize instance when it is first required, use synchronized block + double checking that instance is null + volatile keyword for instance
   - _lazy initialization with initialization holder_: initialize instance when it is first required, use private inner class to hold instance
   - _using enum_ (handles serialization using Java's in-built mechanism)

**Pitfalls**:
   - easy to miss dependencies
   - implementing through static variable that is held per class loader but not per JVM
   - mutable global object


## Builder
**Purpose** - construct complex objects step by step.

**When**:
   - immutable classes with multiple attributes
   - complex process to construct an object with involving multiple steps

**Implementation**:
   1. provide a builder with methods to create parts of object and method that builds final object (prefer to be inner static class);
   2. provide a director that define order of building;
   3. _*optional_ provide method to return already built object.

**Pitfalls**:
   - overall complexity of the code increases because of crearing multiple new classes


## Prototype
**Purpose** - copy existing object to create a separate new one.

**When**:
  - construction of object is costly or not possible (object is supplied)
  - code shouldn't depend on concrete classes that need to be copied

**Implementation**:
  - implement Cloneable interface, override and make public clone() method, implement copy constructors to allow deep copy
  - implement Serialization interface, use SerializationUtils.roundtrip() method to perfom serialization and deserialization of object

**Pitfalls**:
  - bad with classes that have multiple mutable attributes that require deep copy

![structure](https://github.com/olena-syrotenko/design-patterns/assets/104794400/462b64b7-208e-4e09-bd57-71ad38fc96cc)


## Factory method
**Purpose** - provide an interface for creating objects in a superclass

**When**:
   - want to move creation logic into a separate class
   - don't know beforehand the exact types and dependencies

**Implementation**:
   1. provide interface for a creator with get object method
   2. provide implementations of this interface with overriding method to return object (using _inheritance_ to define concrete creation method)

**Pitfalls**:
   - not easy to refactor exisiting code into factory method


## Abstract Factory
**Purpose** - produce families of related object.

**When**:
   - we have two or more objects which form family and we don't want to depend on the concrete class'

**Implementation**:
   1. stidying the product "sets"
   2. create abstract factory class with abstract methods
   3. implement methods for each define "set" (family)
   
   Abstract factory is an object with multiple _factory methods_.

**Pitfalls**:
   - adding a new product requires changes to base factory and _all_ its implementations
