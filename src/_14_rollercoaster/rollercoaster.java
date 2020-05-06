package _14_rollercoaster;

import javax.swing.JOptionPane;

public class rollercoaster {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null,"Let's see if your tall enough to ride the roller coaster.");
String height= JOptionPane.showInputDialog("How tall are you?(don't put the inches sign ;)");
	int heightasint=Integer.parseInt(height);
	if(heightasint>48) {
JOptionPane.showMessageDialog(null,"You can ride by yourself!");
	
	}
	if(heightasint<42) {
		JOptionPane.showMessageDialog(null,"Aw man, looks like your gonna have to grow a little.");

	}
	if(heightasint>42&&heightasint<48)
		JOptionPane.showMessageDialog(null,"You can ride but your going to have to go on with someone else.");

}

	
	
}
	

