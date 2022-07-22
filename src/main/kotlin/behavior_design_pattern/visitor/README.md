# Visitor

Visitor is a behavioral design pattern that lets you separate algorithms from the objects on which they operate.

The visitor pattern consists of two parts:

- a method called Visit() which is implemented by the visitor and is called for every element in the data structure
- visitable classes providing Accept() methods that accept a visitor