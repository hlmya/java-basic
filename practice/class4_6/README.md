# Classes and Objects Class

**[LECTURE MATERIAL](http://kitlei.web.elte.hu/segedanyagok/foliak/java/en-java-bsc/02object-orientation.pdf)**

## We will cover today

* Packages (Yeeey, again)
* The java.util Packages
* The java.util Arraylist


## Today's problem
![Java Teacher](http://i0.kym-cdn.com/entries/icons/original/000/006/306/FlipTable.jpg)

George Lamborghini is the instructor of two Java Practices and he is getting crazy because the students never stop commuting between these two groups.

He decided it is time to register everybody in the academic system and decided to do so in the famous Neptune. When he was doing it, he noticed that the system is not so friendly and it would take ages to do so.

Your job is to create an academic system where George can register all the students through command line.

### Things you need to create

* Classroom class, with one ArrayList and the students (Persons) in it.
* A menu using switch case to run through the system options.
* Menu with the options add, remove and see the sorted list of students
* Function that takes one Classroom object and check if there are students attending both classrooms

### Constraints

Exceptions should be handled (if they exist)

Classes must be declared in a folder called "models" and the class containing main should be on the root folder

The Students are persons so we should re-use our previous class models

### Before Starting
For some reason, the last programmer had a misunderstanding in the Person.equals method and it is always returning false. Can you spot it?



## Documentation regarding the examples:
* [Java Util ArrayList](https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html)

#######

**[LECTURE MATERIAL](http://kitlei.web.elte.hu/segedanyagok/foliak/java/en-java-bsc/02object-orientation.pdf)**

## We will cover today

* We go through the main mistakes of the assignments
* Play with Inheritance and specially the subclasses
* Re-build class 4 examples using inheritance

## What we can do when we create subclasses (From the Oracle Tutorial bellow)
* The inherited fields can be used directly, just like any other fields.
* You can declare a field in the subclass with the same name as the one in the superclass, thus hiding it (not recommended).
* You can declare new fields in the subclass that are not in the superclass.
* The inherited methods can be used directly as they are.
* You can write a new instance method in the subclass that has the same signature as the one in the superclass, thus overriding it.
* You can write a new static method in the subclass that has the same signature as the one in the superclass, thus hiding it.
* You can declare new methods in the subclass that are not in the superclass.
* You can write a subclass constructor that invokes the constructor of the superclass, either implicitly or by using the keyword super.

##Cool links
[Inheritance Concept (From Oracle)] (https://docs.oracle.com/javase/tutorial/java/concepts/inheritance.html)
[Inheritance Tutorial (From Oracle)] (https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html)
