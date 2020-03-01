# Custom Immutable Class Example In Java

### To create an immutable class in java, follow the below steps:

* Declare the class as final so it can not be inherited/extended.
* Make all fields private so that direct access of the fields are not allowed outside the class.
* Do not provide setter methods for fields.
* Make all mutable fields final so that it’s value can be assigned only once.
* Initialize all the fields via a constructor performing deep copy.
* Perform cloning of objects in the getter methods to return a copy rather than returning the actual object reference.