# Design Patterns

1. [SOLID](#solid)
2. [Pattern Types](#pattern-types)
3. Creational Patterns
   - [Singleton](#singleton)
   - [Builder](#builder)
   - [Prototype](#prototype)
   - [Factory Method](#factory-method)
   - [Abstract Factory](#abstract-factory)
4. Structural Patterns
   - [Adapter](#adapter)
   - [Bridge](#bridge)
   - [Composite](#composite)
   - [Decorator](#decorator)
   - [Facade](#facade)
   - [Flyweight](#flyweight)
   - [Proxy](#proxy)

## SOLID

1. **Single Responsibility** Principle - there should be one and only one reason for a class to change. To check this principle we can answer the question - what is class supposed to do and what exactly it is doing right now.
2. **Open Closed** Principle - classes should be open for extensions but closed for modifications. In other words, we should be able to extend existing behaviour but existing code remains unchanhed.
3. **Liskov Substitution** Principle - replacing base class objects with child class objects should not alter the program behavior.
4. **Interface Segregation** Principle - clients should not be forced to implement the functionalities that they do not require. In other words, it is better to have many interfaces specific to different requirements instead of creating only one general interface.
5. **Dependency Inversion** Principle - high level modules should _not_ depend on low level modules. Both should depend on abstractions.


## Pattern Types

1. **Creational Patterns** - deal with the process of creation of objects of classes.
2. **Structural Patterns** - deal with how classes and objects are arranged and composed.
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
   - we have two or more objects which form family and we don't want to depend on the concrete class.

**Implementation**:
   1. stidying the product "sets"
   2. create abstract factory class with abstract methods
   3. implement methods for each define "set" (family)
   
   Abstract factory is an object with multiple _factory methods_.

**Pitfalls**:
   - adding a new product requires changes to base factory and _all_ its implementations


## Adapter
**Purpose** - allow objects with incompatible interfaces to collaborate.

**When**:
   - need to use existing class but the interface isn't compatible with the rest of code

**Implementation**:
   1. create Adapter class that will implement interface expected by client
   2. connect an existing class and an adapter:
      - _class adapter_ (using inheritance): extend adapter from existing class
      - _object adapter_ (using composition): add existing class as an attribute in adapter ***_preferred_**

**Pitfalls**:
   - usage of inheritance to implement adapter create unrelated methods in target code, polluting it


## Bridge
**Purpose** - split a large class or a set of closely related classes into two separate hierarchies — abstraction and implementation.

**When**:
   - need to have abstraction and implementation without affecting each other
   - need to extend a class in several orthogonal (independent) dimensions
   - need to divide and organize a monolithic class that has several variants of some functionality

**Implementation**:
   1. define abstraction class with base operations
   2. *_optionally_ define a refind abstraction with more specialized operations
   3. define an implementation class that will be used by abstraction (with composition) _if we have a single implementation than we can skip creating the interface_
   4. define several concrete implementations

**Pitfalls**:
   - need to have a well thought out and fairly comprehensive design
   - need to be designed up front (adding to legacy code is difficult)


## Composite
**Purpose** - compose objects into tree structures and then work with these structures as if they were individual objects.

**When**:
   - have a part-whole relationship or hierarchy of objects and need to treat all objects in this hierarchy uniformly
   - need to organize objects into tree structure

**Implementation**:
   1. create Component interface in which defined methods both for leaf and composite objects
   2. implement the Composite with add/remove a child operations
   3. implement Leaf with basic method

**Pitfalls**:
   - difficult to restrict what is added to hierarchy
   - creational of original tree is complex if number of nodes is high


## Decorator
**Purpose** - attach new behaviors to objects by placing these objects inside special wrapper objects.

**When**:
   - need to assign extra behaviors to objects at runtime without breaking the code
   - not possible to extend an object’s behavior using inheritance

**Implementation**:
   1. define a Component that is interface needed or already used by client and its concrete implementation
   2. define a Decorator that implements Component and also has reference to a concrete component implementation
   3. provide additional behavior in decorator methods - decorator should add helpful small behaviors to object's original behavior and don't change meaning of operation.

**Pitfalls**:
   - can grow up to a large number of classes, where each class adds a small functionality.


## Facade
**Purpose** - provide a simplified interface to a library, a framework or any other complex set of classes.

**When**:
   - need to have a limited but straightforward interface to a complex subsystem
   - client is tightly coupled with a large number of interfaces and classes of a subsystem

**Implementation**:
  - create a Facade class with method that exposes each of the "use case" of subsystem. Can be an interface to take care of working with different subsystems

**Pitfalls**:
   - can hide improperly designed API
   - misuse as a "container of related methods"


## Flyweight
**Purpose** - fit more objects into the available amount of RAM by sharing common parts of state between multiple objects instead of keeping all of the data in each object.

**When**:
   - system needs a large number of particular objects and maintaining them is a performance concern

**Implementation**:
  1. identify _intrinsic_ (unchanging data duplicated across many objects) and _extrinsic_ (contextual data unique to each object) states of object
  2. implement Flyweight with intrinsic state and methods that accept extrinsic state as parameters. this object must be immutable
  3. implement Flyweight factory whoch caches flyweights and provide methods to get them
  4. in client either maintaining extrinsic state or compute it when using flyweights

**Pitfalls**:
   - runtime cost may be added for maintaining extrinsic state
   - typical web app may not have a lot of use of this pattern


## Proxy
**Purpose** - provide a substitute or placeholder for another object to controls access to it.

**When**:
   - _protection_ proxy - control access to original object's operations
   - _remote_ proxy - local representation of a remote object
   - _virtual_ proxy - lazy initialization of a heavyweight object
   - _logging_ proxy - keep a history of requests to the service object
   - _caching_ proxy - cache results of client requests and manage their lyfecycle
   - _smart reference_ proxy - need to dismiss a heavyweight object once there are no clients that use it

**Implementation**:
  1. Static proxy:
     - create Proxy class that implements same interface as a real service and, if needed, contains instance of a real service
     - implement proxy methods with needed functionality before delegating to real service
     - introduce a creation method that decides whether client gets a proxy or a real service
   2. Dynamic proxy:
      - implement java.lang.reflect.InvocationHandler interface
      - in invoke() method decide actions according to what Method of real object is needed
      - actual proxy instance is created using java.lang.reflect.Proxy by client

**Pitfalls**:
   - dynamic proxy only works if a target service implements at least one interface
