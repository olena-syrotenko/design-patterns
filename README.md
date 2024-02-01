# Design Patterns

1. [SOLID](#solid)
2. [Pattern Types](#pattern-types)
3. Creational Patterns
   - [Prototype](#prototype)

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

## Prototype
**Purpose** - copy existing object to create a separate new one.

**When**:
  - construction of object is costly or not possible (object is supplied)
  - code shouldn't depend on concreate classes that need to be copied

**Implementation**:
  - implement Cloneable interface, override and make public clone() method, implement copy constructors to allow deep copy
  - implement Serialization interface, use SerializationUtils.roundtrip() method to perfom serialization and deserialization of object

**Pitfalls**:
  - bad with classes that have multiple mutable attributes that require deep copy

![structure](https://github.com/olena-syrotenko/design-patterns/assets/104794400/462b64b7-208e-4e09-bd57-71ad38fc96cc)

