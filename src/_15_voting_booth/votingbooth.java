package _15_voting_booth;

import javax.swing.JOptionPane;

public class votingbooth {
public static void main(String[] args) {
	
	String age= JOptionPane.showInputDialog("How old are you?");
	int ageasint=Integer.parseInt(age);
	if(ageasint>18) {
	JOptionPane.showMessageDialog(null,"Who do you want to be president?");
	
	}
	if(ageasint<18){
		JOptionPane.showMessageDialog(null,"Nobody cares what you think.");
	}
	
	
	
	
}
}
	
	
	
	
	
	
	
	

