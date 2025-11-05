package petstore;

import java.util.*;


class PetStore {	
	public static void main(String args[]) {
		ArrayList<Pet> pets = new ArrayList<Pet>();
		Scanner scanner = new Scanner(System.in);
		String name = "";
		Pet aPet = new Pet();
		String coatColor;
		double weight;
		
		while (true) {
			System.out.print("Enter 'c' for cat, 'd' for dog, 'r' for rabbit, or 'f' for Betta fish (or STOP to quit):");
			String input = scanner.next().toLowerCase();
			
			if (input.equalsIgnoreCase("stop")) break;
			
			if (input.charAt(0) == 'c') {
				System.out.println("Enter the name of the cat (or STOP to quit): ");
				name = scanner.next();
				if (name.equalsIgnoreCase("STOP"))
					break;
				
				System.out.println("Enter the cat's coat color: ");
				coatColor = scanner.next();
				aPet = new Cat();
				((Cat) aPet).setCoatColor(coatColor);
			} else if (input.charAt(0) == 'd') {
				System.out.println("Enter the name of the dog (or STOP to quit): ");
				name = scanner.next();
				if (name.equalsIgnoreCase("STOP"))
					break;
				System.out.println("Enter the dog's weight: ");
				weight = scanner.nextDouble();
				aPet = new Dog();
				((Dog) aPet).setWeight(weight);
				
			} else if (input.charAt(0) == 'r') {	
				System.out.println("Enter the name of the Rabbit (or STOP to quit): ");
				name = scanner.next();
				if (name.equalsIgnoreCase("STOP"))
					break;
				System.out.println("Enter the Rabbit's coat color: ");
				coatColor = scanner.next();
				aPet = new Rabbit();
				((Rabbit) aPet).setCoatColor(coatColor);
			} else if (input.charAt(0) == 'f'){
				System.out.println("Enter the name of the fish (or STOP to quit): ");
				name = scanner.next();
				if (name.equalsIgnoreCase("STOP"))
					break;
				aPet = new Betta_fish();
				
		    }else {
				System.out.println("Invalid choice. Please enter c, d, r, f, or STOP.");
				continue;
			}
			
			aPet.setName(name);
			pets.add(aPet);
		}
		
		
		System.out.println("\n--- Pet Output ---");
		
		if (pets.isEmpty()) {
			System.out.println("No pets were added.");
		} else {
			for (Pet pet : pets) {
				System.out.print(pet.getName() + " is a");
				if (pet instanceof Cat) {
		        	System.out.println(" " + ((Cat)pet).getCoatColor() + " cat.");
		        	System.out.println(pet.speak());
				}
				else if (pet instanceof Dog) {
					System.out.println(" dog that weighs " + ((Dog)pet).getWeight() + " pounds.");
					System.out.println(pet.speak());
				}else if (pet instanceof Rabbit) {
					System.out.println(" " + ((Rabbit)pet).getCoatColor() + " rabbit.");
					System.out.println(pet.speak());
				
				}else if (pet instanceof Betta_fish) {
					System.out.println("Betta fish.");
					System.out.println(pet.speak());	
				
				}else {
					System.out.println("An unknown animal.");
				}
		    	System.out.println(); 
		    }
		}
		scanner.close();
	}
}

