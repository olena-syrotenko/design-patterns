# Design Patterns

1. [SOLID](#solid)

## SOLID

1. **Single Responsibility** Principle - there should be one and only one reason for a class to change. To check this principle we can answer the question - what is class supposed to do and what exactly it is doing right now.
2. **Open Closed** Principle - classes should be open for extensions but closed for modifications. In other words, we should be able to extend existing behaviour but existing code remains unchanhed.
3. **Liskov Substitution** Principle - replacing base class objects with child class objects should not alter the program behavior.
4. **Interface Segregation** Principle - clients should not be forced to implement the functionalities that they do not require. In other words, it is better to have many interfaces specific to different requirements instead of creating only one general interface.
5. **Dependency Inversion** Principle - high level modules should _not_ depend on low level modules. Both should depend on abstractions.
