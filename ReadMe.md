Some of the benefits of using design patterns are:

- Design Patterns are already defined and provides industry standard approach to solve a recurring problem, so it saves time if we sensibly use the design pattern. There are many java design patterns that we can use in our java based projects.
- Using design patterns promotes reuse-ability that leads to more robust and highly maintainable code. It helps in reducing total cost of ownership (TCO) of the software product.
- Since design patterns are already defined, it makes our code easy to understand and debug. It leads to faster development and new members of team understand it easily.
- Loosely coupled

DP Categories:

- creational : solution to instantiate a object in the best possible way for specific situations
    creational.singletone, creational.factory pattern/method, abstract creational.factory, creational.builder, creational.prototype
    
- structural :different ways to create a class structure
    Object structural.adapter(here), Class structural.adapter,
- behavioral

Common DPs review:
- creational.factory pattern(or creational.factory method)
- creational.abstract-factory: like creational.factory but with more encapsulation, so there is a lot of interface 
and for creating each subclass there is different creational.factory 
- behavioral.strategy: a class can have different behavior dynamically(implementation change on runtime)
- behavioral.state: good for implementing life cycle, to change behavior dynamically
very similar to strategy, I think based on concept we choose the pattern
- behavioral.observer: like mess publisher-subscriber
- structural.decorator : add functionality to object at runtime (wrap an object inside another object of the same type)
it is like subclass that has extra method, but it is runtime.
 - structural.proxy : Proxy is a structural design pattern that lets you provide a substitute or placeholder for another object.
  A proxy controls access to the original object, allowing you to perform something either before or after the request 
  gets through to the original object.(it has an instance of real object and client does not call real object directly)