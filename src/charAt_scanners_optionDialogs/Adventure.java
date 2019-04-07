package charAt_scanners_optionDialogs;

import javax.swing.JOptionPane;

public class Adventure {

	public static void main(String[] args) {
		int answerI = JOptionPane.showOptionDialog(null, "You are in a dark forest.  You see a small wooden cabin ahead.  Do you enter it?", "Adventure", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] {"Yes",  "No"}, null);
if (answerI == 1) {
	int answerII = JOptionPane.showOptionDialog(null, "It begins to rain.  You see railroad tracks leading off into the distance.  Do you follow them or go back to the cabin?", "Adventure", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] {"Follow the railroad tracks", "Go back to the cabin"},  null);
if (answerII == 1) {
	int answerVI = JOptionPane.showOptionDialog(null, "As you open the door, you hear something rattling inside the dark cabin's single room.  A cold wind blows through, chilling your bones.  Do you walk inside or run away?", "Adventure", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] {"Walk inside", "Run away"}, null);
if (answerVI == 1) {
	JOptionPane.showMessageDialog(null, "Frightened, you run away into the woods, soon becoming lost.  Nothing seems familiar.  It seems that the wolves will be dining well tonight.", "Adventure", JOptionPane.INFORMATION_MESSAGE);
	JOptionPane.showMessageDialog(null, "END OF GAME", "Adventure", JOptionPane.INFORMATION_MESSAGE);
}else if(answerVI == 0) {
	JOptionPane.showMessageDialog(null, "The walls of the cabin are dripping with an unidentifiable liquid.  You see a glint of metal, and see kitchen knives that have been thrust into the wall.  Abandoning your courage, you run.", "Adventure", JOptionPane.INFORMATION_MESSAGE);
	JOptionPane.showMessageDialog(null, "END OF GAME", "Adventure", JOptionPane.INFORMATION_MESSAGE);}
}else if(answerII == 0) {
	int answerIV = JOptionPane.showOptionDialog(null, "Walking next to the tracks, you come to a bridge.  Do you attempt to cross it, knowing that any train that comes by will hit you, or go back to the cabin.", "Adventure", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] {"Cross the bridge", "Go back to the cabin"}, null);
if (answerIV == 1) {
	int answerV = JOptionPane.showOptionDialog(null, "As you open the door, you hear something rattling inside the dark cabin's single room.  A cold wind blows through, chilling your bones.  Do you walk inside or run away?", "Adventure", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] {"Walk inside", "Run away"}, null);
	if (answerV == 1) {
		JOptionPane.showMessageDialog(null, "Frightened, you run away into the woods, soon becoming lost.  Nothing seems familiar.  It seems that the wolves will be dining well tonight.", "Adventure", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "END OF GAME", "Adventure", JOptionPane.INFORMATION_MESSAGE);
	}else if(answerV == 0) {
		JOptionPane.showMessageDialog(null, "The walls of the cabin are dripping with an unidentifiable liquid.  You see a glint of metal, and see kitchen knives that have been thrust into the wall.  Abandoning your courage, you run.", "Adventure", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "END OF GAME", "Adventure", JOptionPane.INFORMATION_MESSAGE);}
	}else if(answerIV == 0) {
	int answerVII = JOptionPane.showOptionDialog(null, "You hear a loud whistle and see a bright light advancing towards you.  Do you risk jumping off of the bridge into the river below, which will almost certainly kill you?", "Adventure", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] {"Yes", "No"}, null);
if (answerVII == 0) {
	JOptionPane.showMessageDialog(null, "The water hits you like concrete.  You slowly swim to the bank and heave yourself onto it.  Luckily, you survived.", "Adventure", JOptionPane.INFORMATION_MESSAGE);
JOptionPane.showMessageDialog(null, "END OF GAME", "Adventure", JOptionPane.INFORMATION_MESSAGE);
}else if(answerVII == 1) {
	JOptionPane.showMessageDialog(null, "The train suddenly vanishes, leaving you to wonder whether it was a figment of your overactive imagination.", "Adventure", JOptionPane.INFORMATION_MESSAGE);
	JOptionPane.showMessageDialog(null, "END OF GAME", "Adventure", JOptionPane.INFORMATION_MESSAGE);
}
}
}
}else if(answerI == 0) {
	int answerIII = JOptionPane.showOptionDialog(null, "As you open the door, you hear something rattling inside the dark cabin's single room.  A cold wind blows through, chilling your bones.  Do you walk inside or run away?", "Adventure", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] {"Walk inside", "Run away"}, null);
	if (answerIII == 1) {
		JOptionPane.showMessageDialog(null, "Frightened, you run away into the woods, soon becoming lost.  Nothing seems familiar.  It seems that the wolves will be dining well tonight.", "Adventure", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "END OF GAME", "Adventure", JOptionPane.INFORMATION_MESSAGE);
	}else if(answerIII == 0) {
		JOptionPane.showMessageDialog(null, "The walls of the cabin are dripping with an unidentifiable liquid.  You see a glint of metal, and see kitchen knives that have been thrust into the wall.  Abandoning your courage, you run.", "Adventure", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "END OF GAME", "Adventure", JOptionPane.INFORMATION_MESSAGE);}}
	}

}
