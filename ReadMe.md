Some of the benefits of using design patterns are:

- Design Patterns are already defined and provides industry standard approach to solve a recurring problem, so it saves time if we sensibly use the design pattern. There are many java design patterns that we can use in our java based projects.
- Using design patterns promotes reusability that leads to more robust and highly maintainable code. It helps in reducing total cost of ownership (TCO) of the software product.
- Since design patterns are already defined, it makes our code easy to understand and debug. It leads to faster development and new members of team understand it easily.
- Loosely coupled

DP Categories:

- creational : solution to instantiate a object in the best possible way for specific situations
    creational.singletone, creational.factory pattern/method, abstract creational.factory, creational.builder, creational.prototype
    
- structural :different ways to create a class structure
    Object structural.adapter(here), Class structural.adapter,
- behavioral

Common DPs:
- creational.factory pattern(or creational.factory method)
- abstract creational.factory: like creational.factory but with more encapsulation, so there is a lot of interface 
and for creating each subclass there is different creational.factory 
- behavioral.strategy: a class can have different behavior dynamically.
- behavioral.observer: like mess publisher-subscriber
- behavioral.state: good for implementing life cycle, to change behavior dynamically