# The Lion King Party

![King Lion picture](https://upload.wikimedia.org/wikipedia/en/2/23/LionKingCharacters.jpg)


Mufasa is organizing a party for all the animals from the forest. Everything is being managed by Rafiki and Zazu, who are now registering all the animals and their specific needs.

The entrance will be separated according to the animals needs. The ones who need to land will have an specific landing area, the ones arriving by the river or sea another area and the other ones will arrive by the main entrance.

Rafiki will be responsible for the Entrance control, while Zazu will be the DJ.

Every guest will have the right of recommending one song for the party.


## Use cases
* Mufasa may:
  * Add a new guest (Name, specie name, song)
  * Remove a guest
* Rafiki may:
  * Check if a guest is allowed by its name
  * Check which are the needs by animal name (e.g. Simba) or specie name (e.g. Lion)
* Zazu may:
  * Pick a random song
  * Check which songs were already played


## Constraints
* All the strings should not be case sensitive, you can use [toUpperCase](http://docs.oracle.com/javaee/5/jstl/1.1/docs/tlddocs/fn/toUpperCase.fn.html) or [toLowerCase](http://docs.oracle.com/javaee/5/jstl/1.1/docs/tlddocs/fn/toLowerCase.fn.html) functions as you can also use [equalsIgnoreCase](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#equalsIgnoreCase(java.lang.String).
* The needs are particular for the specie and not for the particular animal, e.g. Turtles need a fresh tank of water for every now and then.
* The name of the animal is unique.
* The same menu is shown to all users, there is no need of implementing its use cases separated
* Exceptions need to be handled (e.g. when there is no more songs on the list and the user asks to pick a new one)
* According to the arrival mode, the animals have different needs:
  * Flying: The extension of its wings
  * Swimming: Where the animal will come from (sea or river)
  * Main entrance: Number of paws

* The system should have the following menu items:
  * Register guest (where you can register all the guest information)
  * Remove a guest (the system asks the name and deletes the user)
  * Pick a song (after selection the song goes automatically for the list of played songs)
  * List played songs
  * Check if an animal is on the Guest list
  * List animal needs by animal name
  * List animal needs by specie name

## Grading:
  On a scale of 10
  * Classes correctly implementing OO concepts (3)
  * Guest adding and removing (2)    
  * List of played songs (1)
  * Working menu (1)
  * Song random selection (1)  
  * Song removing after sorting (1)
  * Verification of unique names before adding(1)

**Extra Points**
You can get extra-points by implementing one of the following libraries:
* File Input **AND** File Output (write and read at least one group from records and fill Array):   https://docs.oracle.com/javase/7/docs/api/java/io/FileOutputStream.html
https://docs.oracle.com/javase/7/docs/api/java/io/FileInputStream.html
* JUnit (at least 5 meaningfull test cases)
http://junit.org/junit5/
* Proposed Libraries, feel free to suggest new libraries, for it send an e-mail with the planned implementation of the library.


What makes you loose points:
  * Untreated exceptions, Important: Simply skipping does not count as a treated exception, you need to keep your user informed about what he needs to do and your software should not crash.
  * Not completed code  
  * Wrong object or variable scope  
  * Direct access to object variables
  * Wrong OOP practices
  * User unfriendly or trapped code



## Assignment Requirements
  * This is an individual assignment;
  * The assignment can be done in two people in case the students choose to implement the extra-points;
  * plagiarism will be graded with zero and may be subject of sanctions given by ELTE regulations;
  * Indentation and readable code matters
  * It is requested to implement at least one Interface and one Abstract class (and it must make sense)
  * There is not a strict manner of implementation, use the Java Language capabilities on the best way you can;
  * The students may be requested to give further explanations regarding the implementation in order to get the grade (regarding specially the understanding of the OO concepts).


## Recommendations

There is no need to follow it here, but here we will have some recommendations to make it easier.
* Implement Flying, Land and Swimming animals in different classes inheriting a generic class animal, where you define the general animal characteristics;
* Implement the menu inside a switch case implementation inside a do while loop;
* Put all the animals into an ArrayList

![No IDE](https://i.imgur.com/30o1Lqc.jpg)

Copy link: https://github.com/BasicJavaElte/Assignment2-2017/blob/master/README.md
