package numbers;

import javax.swing.JOptionPane;

public class LeapYear {

	public static boolean leapYear(int x) {
		if (x % 4 == 0 && x % 100 != 0)
			return true;
		else if (x % 100 == 0 && x % 400 == 0) {
			return true;
		} else
			return false;
	}

	public static void main(String args[]) {
		String decision;
		String input;
		int year;

		String isD = "is divisible";
		String isNotD = "is not divisible";

		input = JOptionPane.showInputDialog("Enter a year : ");
		year = Integer.parseInt(input);

		decision = "";

		decision += "The year : " + year + "\n" + "\n";
		if (year % 4 == 0)
			decision += year + " " + isD + " by 4 \n";
		else
			decision += year + " " + isNotD + " by 4 \n";

		if (year % 100 == 0)
			decision += year + " " + isD + " by 100 \n";
		else
			decision += year + " " + isNotD + " by 100 \n";

		if (year % 400 == 0)
			decision += year + " " + isD + " by 400 \n";
		else
			decision += year + " " + isNotD + " by 400 \n";

		if (leapYear(year) == true)
			decision += year + " is a leap year";
		else
			decision += year + " is NOT a leap year";

		JOptionPane.showMessageDialog(null, decision);

	}

}