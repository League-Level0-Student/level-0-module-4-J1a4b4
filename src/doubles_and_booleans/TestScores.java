package doubles_and_booleans;

import javax.swing.JOptionPane;

public class TestScores {

	public static void main(String[] args) {
	String score = JOptionPane.showInputDialog(null, "What was your test score?");
	double testScore = Double.parseDouble(score);
	if(testScore > 100){
	JOptionPane.showMessageDialog(null, "You're lying.");
	}else if(testScore > 75.1) {
	JOptionPane.showMessageDialog(null, "Good job! You must have worked hard!");
	}else {
	JOptionPane.showMessageDialog(null, "You need to study harder.");
	}
	}

}
