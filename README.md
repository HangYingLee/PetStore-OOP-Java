# PetStore-OOP-Java
A simple Java project created for CS210 at Bellevue College to demonstrate OOP concepts. It includes classes for different pets (Rabbit, Betta Fish) and a PetStore main class that manages them.
---

## Project Overview

In this assignment, I extended the original Pet program by creating **two new pet subclasses**:
- Rabbit    : includes a 'coatColor' field  
- Betta_fish: includes a unique 'speak()' method  

The main program ('PetStore.java') was modified to:
- Allow the user to create different types of pets (Cat, Dog, Rabbit, Betta Fish)
- Store all pet objects in an 'ArrayList<Pet>
- Display each pet’s description and its speak() message using polymorphism

---

## Classes Included
Pet       :  Base class defining name and speak() method
Cat       : Subclass extending 'Pet': includes coat color
Dog       : Subclass extending 'Pet': includes weight
Rabbit    : New subclass: includes coat color 
Betta fish: New subclass: has a custom speak() method
PetStore  : Main class with console interaction and output


---
## Example of Console Output
Enter 'c' for cat, 'd' for dog, 'r' for rabbit, or 'f' for Betta fish (or STOP to quit):r
Enter the name of the Rabbit (or STOP to quit): 
Rabbittt
Enter the Rabbit's coat color: 
white
Enter 'c' for cat, 'd' for dog, 'r' for rabbit, or 'f' for Betta fish (or STOP to quit):
f
Enter the name of the fish (or STOP to quit): 
fushhh
Enter 'c' for cat, 'd' for dog, 'r' for rabbit, or 'f' for Betta fish (or STOP to quit):
stop

--- Pet Output ---
Rabbittt is a white rabbit.
I am a rabbit.

fushhh is aBetta fish.
Bo!Bo!Bo! I am a beautifal fish.

---

## Concepts Demonstrated
- Class inheritance and hierarchy
- Method overriding -> speak() method
- Polymorphism using ArrayList<Pet>
- Encapsulation through private fields and accessors (get / set method)
- Console-based user input with 'Scanner'

---

## File List
PetStore-OOP-Java/
├── Pet.java
├── Cat.java
├── Dog.java
├── Rabbit.java
├── Betta_fish.java
└── PetStore.java

## Author
**Ashley (Hang Ying) Lee**  
Student at **Bellevue College**  
Assignment for **CS210 – Object-Oriented Programming (Java)**  
Preparing for transfer to **University of Washington (CS Major)**

---

## Notes
- All `.java` source code files are included in this repository.  
- The program can be compiled and executed in **Eclipse**, **IntelliJ**, or any Java IDE.  
- Created for educational purposes.

