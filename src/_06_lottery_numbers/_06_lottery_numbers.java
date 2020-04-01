package _06_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class _06_lottery_numbers {

public static void main(String[] args) {
	String var="";
	Random ran = new Random();
	
	int Number=ran.nextInt(5)+1;
	for(int i=0;i<5;i++) 
	
	{
	var+=ran.nextInt(5)+1;
	}
		JOptionPane.showMessageDialog(null,var);
		
	
	
	
	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
