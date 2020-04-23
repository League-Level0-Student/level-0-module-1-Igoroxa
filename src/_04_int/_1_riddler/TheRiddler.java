package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String riddle = JOptionPane.showInputDialog("Brothers and sisters I have none but this mans father is my fathers son." 
		 + " Who is the man?");

		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (riddle.equalsIgnoreCase("Fathers son")) { JOptionPane.showMessageDialog(null, "correct");
score += 1;}
		// 5. Otherwise, say "wrong" and tell them the answer
else {JOptionPane.showMessageDialog(null, "incorrect");}

		// 6. Add some more riddles
String riddletwo = JOptionPane.showInputDialog("What can travel around the world while staying in a corner?");

		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (riddletwo.equalsIgnoreCase("a stamp")) { JOptionPane.showMessageDialog(null, "correct");
score += 1;}
		// 5. Otherwise, say "wrong" and tell them the answer
else {JOptionPane.showMessageDialog(null, "incorrect");

		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, score);
	}
}
}

