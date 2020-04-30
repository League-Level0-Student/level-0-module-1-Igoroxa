package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class UnBirthday {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("When is your birthday? No year");
		if (input.equals("04/16")) {
			JOptionPane.showMessageDialog(null, "HAPPY BIRTHDAY");
			System.out.println("HAPPYBIRTHDay");
		} else {
			JOptionPane.showConfirmDialog(null, "HAPPY UNBIRTHDAY");
		}
	}
}
