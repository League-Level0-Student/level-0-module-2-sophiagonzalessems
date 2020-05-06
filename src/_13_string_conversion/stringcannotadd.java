package _13_string_conversion;

import javax.swing.JOptionPane;

public class stringcannotadd {
	// 1) Make a main method that includes all the steps below&
public static void main(String[] args) {

	// 2) Ask the user to enter number 4 and hold it in the variable fourAsString 
	String four=JOptionPane.showInputDialog("Enter the number 4");
	// 3) Ask the user to enter number 6 and hold it in the variable sixAsString
	String six=JOptionPane.showInputDialog("Enter the number 6");
	// 4) Print the addition of fourAsString and sixAsString using JOptionPane 
			// Did you notice 46 instead of 4 + 6 = 10? 
	JOptionPane.showMessageDialog(null,four + six);
	// 5) Ask the user to enter number 5 and hold it in the variable fiveAsString
	String five=JOptionPane.showInputDialog("Enter the number 5");
	// 6) Print the addition of the variables fourAsString, sixAsString, and fiveAsString 
	//Did you notice 456 instead of 4 + 6 + 5 = 15? 
	JOptionPane.showMessageDialog(null, four+six+five);
	// Insert fourAsString inside the parenthesis of Integer.parseInt() and set the method equal to fourAsInt 
	// Hint: int fourAsInt = Integer.parseInt(fourAsString);
	int fourasint= Integer.parseInt(four);
	// 7) Do the same for sixAsString
	int sixasint= Integer.parseInt(six); 
	// 8) Print the addition of fourAsInt and sixAsInt using JOptionPane 
	JOptionPane.showMessageDialog(null,fourasint + sixasint);
	// Did you notice the value 10? If so, hurray! You just changed the type of your variable from String to int. 
	// 9)
}
}