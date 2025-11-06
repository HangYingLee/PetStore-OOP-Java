PetStore-OOP-Java
Hi, This is a simple Java project created for CS210 at Bellevue College to demonstrate OOP concepts. It includes classes for different pets (Rabbit, Betta Fish) and a PetStore main class that manages them.
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

## My note and tips for coding
1. extends
   Class Pet { vs class Rabbit extends Pet{
   
   ---> This declares a subclass Rabbit that extends the Pet class.
   
   ---> The extends keyword means Rabbit inherits all the properties and methods of Pet. 
   
3. private
   private String name;
   ---> means the variable can only be accessed within the (Pet) class

4. Void: 
   Public viod setCoatColar (Striing newCoatColar){    
    coatColar = newCoatColar 
   } 
   ---> allows other classes to set the value of coatColor
   
5. Why I did not need to create a constructor in pet class, but some assignment I need?
   It’s because fields like name, weight, and others don’t need to be initialized beforehand in this assignment, we set each pet’s name later by typing it in the console.
   Besides, Java will automatically provide a pre-defined constructor (e.g., null, 0), so a constructor isn't needed.
   
6. Getter method:  
   public String getNaame(){   ---> Getter method does not need an input parameters, but will return the current value of a field.
      return name;             ---> **Before calling a getter, that field must already have a value, usually assigned by a constructor or setter method.
  }
  
7. Setter methods
   public void setName(String name) {   --->  Setter method requires an input parameter, and assigns it to the object's field, so it's no return.
      this.name = name;                 --->  It updates the field's value so that the getter can later return it.
   }                                    

8. Override methods:
   


 



 







---
Author: Hang Ying Lee (Ashley)
Student at Bellevue College
Assignment for CS210 – Object-Oriented Programming (Java)
Preparing for transfer to University of Washington (CS Major)
