# Composite

Composite pattern is a partitioning design pattern and describes a group of objects that is treated the same way as a
single instance of the same type of object. The intent of a composite is to “compose” objects into tree structures to
represent part-whole hierarchies. It allows you to have a tree structure and ask each node in the tree structure to
perform a task.

- As described by Gof, “Compose objects into tree structure to represent part-whole hierarchies. Composite lets client treat individual objects and compositions of objects uniformly”.
- When dealing with Tree-structured data, programmers often have to discriminate between a leaf-node and a branch. This makes code more complex, and therefore, error prone. The solution is an interface that allows treating complex and primitive objects uniformly.
- In object-oriented programming, a composite is an object designed as a composition of one-or-more similar objects, all exhibiting similar functionality. This is known as a “has-a” relationship between objects.

The key concept is that you can manipulate a single instance of the object just as you would manipulate a group of them. The operations you can perform on all the composite objects often have a least common denominator relationship.