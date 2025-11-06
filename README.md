PetStore-OOP-Java
Hi, This is a simple Java project created for CS210 at Bellevue College to demonstrate OOP concepts. It includes classes for different pets (Rabbit, Betta Fish) and a PetStore main class that manages them. ^0^
---

## Project Overview

In this assignment, I extended the original Pet program by creating **two new pet subclasses**:
- Rabbit    : includes a 'coatColor' field  
- Betta_fish: includes a unique 'speak()' method  

The main program ('PetStore.java') was modified to:
- Allow the user to create different types of pets ( New two types of pet: **Rabbit, Betta Fish**; Original two types of pet: Cat, Dog)
- Store all pet objects in an ArrayList<Pet>
- Display each pet’s description and its speak() message using polymorphism

---

## What I Learned
Through this project, I learned how to:
- Design a class hierarchy with **inheritance and polymorphism**.
- Use **ArrayList** to store and process different subclass objects together.
- Override methods
- Practice **encapsulation** by using private fields
- getter/setter methods.
- Understand how Scanner works for user input in a console application.

This project helped me strengthen my understanding of OOP and improved my confidence in writing structured, modular Java programs.

---

## My Notes and Tips for Coding

1. extends：
   
   Class Pet { vs class Rabbit extends Pet{
   
   ---> This declares a subclass Rabbit that extends the Pet class.
   
   ---> The extends keyword means Rabbit inherits all the properties and methods of Pet. 
   
2. private：

   private String name;
   
   ---> means the variable can only be accessed within the (Pet) class

3. Void: 

   Public viod setCoatColar (Striing newCoatColar){    
    coatColar = newCoatColar 
   }
   
   ---> allows other classes to set the value of coatColor
   
4. Why I did not need to create a constructor in pet class, but some assignment I need?
   
   It’s because fields like name, weight, and others don’t need to be initialized beforehand in this assignment, we set each pet’s name later by typing it in the console. Besides, Java 	   will automatically provide a pre-defined constructor (e.g., null, 0), so a constructor isn't needed.

5. Getter method:  

   public String getNaame(){
   
      return name;            
   }

  ---> Getter method does not need an input parameters, but will return the current value of a field.
  
  ---> Before calling a getter, that field must already have a value, usually assigned by a constructor or setter method.
  
6. Setter methods：

   public void setName(String name) {   
      this.name = name;                 
   }                                    

   --->  Setter method requires an input parameter, and assigns it to the object's field, so it's no return.

   --->  It updates the field's value so that the getter can later return it.

7. Override methods:

   public String speak() {
		return "I'm your cuddly little pet.";
	}

   VS

   public String speak() {
		return "I am a rabbit.";
	}

   ---> Rabbit class inherit all method from Pet class, include the speak method. Now overrided the speak method

8. java.util;

   import java.util.*;

   ---> When we use ArrayList and Scanner, we have to write this code

   ---> java.util is a utility package that includes many helpful classes such as Scanner, ArrayList, Random, Collections, HashMap, HashSet, etc.

   ---> The asterisk * means “import all classes in the java.util package.
   
9. ArrayList:
    
    ArrayList<Pet> pets = new ArrayList<Pet>();

    ---> **ArrayList** is a resizable array. It can grow or shrink automatically as we add or remove elements.
    
    ---> ArrayList<Pet>

   		 Declares an ArrayList that stores Pet objects only
    
    ---> new ArrayList<Pet>()

   		 Creates a new empty ArrayList that will hold Pet objects
   

11. Pet aPet = new Pet();   **VS**   aPet = new Rabbit();   **VS**   pets.add(aPet);
    
    ---> Pet aPet = new Pet();

         Declaring a variable named aPet of type Pet and creating a Pet object in memory.

	---> aPet = new Rabbit();
    
		 It's not declaring a new variable, just assigning a new object to the existing variable aPet.

		 For example, the object I created is a Rabbit, which is a subclass of Pet.

 	---> pets.add(aPet);

		 Add the current pet object (aPet, which was just assigned a name and specific pet type) to the pets list so that every entered pet is stored in the ArrayList.
	
    
12. while loop with multiple if-else ：

    while (true) {
    
    // ask for user input
    
    if (stop condition) break;

    if (condition 1) {
    
        // do something
    
    } else if (condition 2) {
    
        // do something
    
    } else if (condition 3) {
    
        // do something
    
    } else {
    
        // handle invalid input
    
    }

    // final actions
    
}

12. break;

    if (name.equalsIgnoreCase("STOP"))
    
    break;

    --> If we type “STOP” (Stop/ stop/ STOP), it runs a break and immediately ends the while loop.

13. for-each loop:

	for (Pet pet : pets) {

	---> It retrieves each Pet object from the pets list, one by one. The loop will continue until all pets have been processed. 


 

---
Author: Hang Ying Lee (Ashley)
Student at Bellevue College
Assignment for CS210 – Object-Oriented Programming (Java)
Preparing for transfer to University of Washington (CS Major)
