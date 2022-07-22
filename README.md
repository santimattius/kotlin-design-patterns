# Kotlin design patterns | Examples
## Design patterns
Design patterns are common solutions to common problems in software design. Each pattern is like a blueprint that can be customized to solve a particular design problem in your code.

Design Patterns are categorized mainly into three categories: 
- [Creational Design Pattern](https://github.com/santimattius/kotlin-design-patterns/tree/master/src/main/kotlin/creational_design_pattern).
- [Structural Design Pattern](https://github.com/santimattius/kotlin-design-patterns/tree/master/src/main/kotlin/structural_design_patterns).
- [Behavioral Design Pattern](https://github.com/santimattius/kotlin-design-patterns/tree/master/src/main/kotlin/behavior_design_pattern).


### Creational Design Pattern

As the name suggests, it provides the object or classes creation mechanism that enhance the flexibilities and reusability of the existing code. They reduce the dependency and controlling how the use interaction with our class so we wouldn't deal with the complex construction. Below are the various design pattern of creational design pattern.

- **[Abstract Factory](https://github.com/santimattius/kotlin-design-patterns/tree/master/src/main/kotlin/creational_design_pattern/abstract_factory)**: It allows us to create objects without specifying their concrete type.
- **[Builder](https://github.com/santimattius/kotlin-design-patterns/tree/master/src/main/kotlin/creational_design_pattern/builder)**: It is used to create the complex objects.
- **[Factory Method](https://github.com/santimattius/kotlin-design-patterns/tree/master/src/main/kotlin/creational_design_pattern/factory_method)**: It allows us to create object without specifying the exact class to create.
- **[Prototype](https://github.com/santimattius/kotlin-design-patterns/tree/master/src/main/kotlin/creational_design_pattern/prototype)**: It is used to create a new object from the existing object.
- **[Singleton](https://github.com/santimattius/kotlin-design-patterns/tree/master/src/main/kotlin/creational_design_pattern/singleton)**: Singleton design pattern make sure that there is only one instance of an object is created.

### Structural Design Patterns

Structural Design Patterns mainly responsible for assemble object and classes into a larger structure making sure that these structure should be flexible and efficient. They are very essential for enhancing readability and maintainability of the code. It also ensure that functionalities are properly separated, encapsulated. It reduces the minimal interface between interdependent things.

- **[Adapter](https://github.com/santimattius/kotlin-design-patterns/tree/master/src/main/kotlin/structural_design_patterns/adapter)**: It provides us for two incompatible classes to work together by wrapping an interface around one of the existing classes.
- **[Composite](https://github.com/santimattius/kotlin-design-patterns/tree/master/src/main/kotlin/structural_design_patterns/composite)**: It wraps a group of objects into a single object.
- **[Bridge](https://github.com/santimattius/kotlin-design-patterns/tree/master/src/main/kotlin/structural_design_patterns/bridge)**: It decouples an abstraction so that two classes can vary independently.
- **[Decorator](https://github.com/santimattius/kotlin-design-patterns/tree/master/src/main/kotlin/structural_design_patterns/decorator)**: It extends the object behavior dynamically at the run time.
- **[Facade](https://github.com/santimattius/kotlin-design-patterns/tree/master/src/main/kotlin/structural_design_patterns/facade)**: It offers a simple interface to more complex underlying objects.
- **[Flyweight](https://github.com/santimattius/kotlin-design-patterns/tree/master/src/main/kotlin/structural_design_patterns/flyweight)**: It decreases the cost of complex object model.
- **[Proxy](https://github.com/santimattius/kotlin-design-patterns/tree/master/src/main/kotlin/structural_design_patterns/proxy)**: It reduces the cost, reduce complexity, and provide the placeholder interface to an underlying object to control access.

### Behavior Design Pattern

Behavior Design Patterns are responsible for how one class communicates with others.

- **[Chain of Responsibility](https://github.com/santimattius/kotlin-design-patterns/tree/master/src/main/kotlin/behavior_design_pattern/chain_of_responsibility)**: It representatives the command to a chain of processing object.
- **[Command](https://github.com/santimattius/kotlin-design-patterns/tree/master/src/main/kotlin/behavior_design_pattern/command)**: It generates the objects which encapsulate actions of parameters.
- **Interpreter**: It implements a specialized language.
- **[Iterator](https://github.com/santimattius/kotlin-design-patterns/tree/master/src/main/kotlin/behavior_design_pattern/iterator)**: It accesses all the element of an object sequentially without violating its underlying representation.
- **[Mediator](https://github.com/santimattius/kotlin-design-patterns/tree/master/src/main/kotlin/behavior_design_pattern/mediator)**: It provides the loose coupling between classes by being the only class that has detailed knowledge of their existing methods.
- **[Memento](https://github.com/santimattius/kotlin-design-patterns/tree/master/src/main/kotlin/behavior_design_pattern/memento)**: It restores an object in the previous state.
- **[Observer](https://github.com/santimattius/kotlin-design-patterns/tree/master/src/main/kotlin/behavior_design_pattern/observer)**: It allows a number of observer objects to see an event.
- **[State](https://github.com/santimattius/kotlin-design-patterns/tree/master/src/main/kotlin/behavior_design_pattern/state)**: It allows an object to modify its behavior when it's internal states changes.
- **[Strategy](https://github.com/santimattius/kotlin-design-patterns/tree/master/src/main/kotlin/behavior_design_pattern/strategy)**: It provides one of the families of algorithm to be selected at the runtime.
- **[Template Method](https://github.com/santimattius/kotlin-design-patterns/tree/master/src/main/kotlin/behavior_design_pattern/template_method)**: It allows the subclasses to provide concrete behavior. It also defines the skeleton of an algorithm as an abstract class.
- **[Visitor](https://github.com/santimattius/kotlin-design-patterns/tree/master/src/main/kotlin/behavior_design_pattern/visitor)**: It separates an algorithm from an object structure by moving the hierarchy of methods into one object.

## References
- [design-patterns by refactoring.guru](https://refactoring.guru/es/design-patterns)
- [ Design Patterns: Elements of Reusable Object-Oriented Software Design Patterns: Elements of Reusable Object-Oriented Software](https://www.oreilly.com/library/view/design-patterns-elements/0201633612/)
- [Patrones de Diseño: Creacionales - CodelyTV](https://pro.codely.com/library/patrones-de-diseno-creacionales-167860/359848/about/)
- [Patrones de Diseño de Comportamiento](https://pro.codely.com/library/patrones-de-diseno-de-comportamiento-185034/431618/path/about)
