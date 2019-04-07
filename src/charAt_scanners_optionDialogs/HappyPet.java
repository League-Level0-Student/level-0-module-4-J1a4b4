package charAt_scanners_optionDialogs;
import javax.swing.JOptionPane;

public class HappyPet {
	static int petHappiness = 0;
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
String petType = JOptionPane.showInputDialog(null, "What kind of pet do you want?");
String petName = JOptionPane.showInputDialog(null, "What do you want to name your pet?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int i = 0; i < 6; i++) {
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do?", "Happy Pet", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Feed", "Groom", "Take to vet" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
if (task == 2) {
	vet(petType, petName);
}else if(task == 1) {
	groom(petType, petName);
}else if(task == 0) {
	feed(petType, petName);
}
if(petHappiness > 30) {
	JOptionPane.showMessageDialog(null, "You love " + petName + " and they love you back.");
break;
}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
		}
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.

static void feed(String petType, String petName){
if(petType.equals("cat")) {
	JOptionPane.showMessageDialog(null, petName + " purrs in response to your feeding them.");
	petHappiness = petHappiness + 20;
}else if(petType.equals("dog")) {
	JOptionPane.showMessageDialog(null, petName + " licks your face to see if what you ate.");
	petHappiness = petHappiness + 10;
}else if(petType.equals("hamster")) {
	JOptionPane.showMessageDialog(null, petName + " squeaks.");
	petHappiness = petHappiness + 10;
	}
}

static void groom(String petType, String petName) {
	if(petType.equals("cat")) {
		JOptionPane.showMessageDialog(null, petName + " quietly allows you to brush them.");
		petHappiness = petHappiness + 7;
	}else if(petType.equals("dog")) {
		JOptionPane.showMessageDialog(null, petName + " wags its tail.");
		petHappiness = petHappiness + 10;
	}else if(petType.equals("hamster")) {
		JOptionPane.showMessageDialog(null, petName + " squeaks.");
		petHappiness = petHappiness + 5;
		}
}

static void vet(String petType, String petName) {
	if(petType.equals("cat")) {
		JOptionPane.showMessageDialog(null, petName + " screeches and claws you.");
		petHappiness = petHappiness - 15;
	}else if(petType.equals("dog")) {
		JOptionPane.showMessageDialog(null, petName + " barks loudly and strains to escape.");
		petHappiness = petHappiness - 15;
	}else if(petType.equals("hamster")) {
		JOptionPane.showMessageDialog(null, petName + " squeaks.");
		petHappiness = petHappiness - 5;
		}
}
}
	
