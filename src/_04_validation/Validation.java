//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _04_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
			 Random randomMaker = new Random();
	for (int i = 0; i < 11; i++) {
		
		int randomChoice = randomMaker.nextInt(10)+1;
		
		System.out.println(randomChoice);

		// 1. Use each value of randomNumber to give the user a random compliment.
		
		
		if (randomChoice ==  ((-1)+1)+1)
			JOptionPane.showMessageDialog(null, "I like your outfit!");
		else if(randomChoice == 2)
			JOptionPane.showMessageDialog(null, "Nice hair.");
		else if(randomChoice == 3)
			JOptionPane.showMessageDialog(null, "I like your socks.");
		else if(randomChoice == 4)
			JOptionPane.showMessageDialog(null, "Your  funny.");
		else if(randomChoice == 5)
			JOptionPane.showMessageDialog(null, "I like your shoes.");
		else if(randomChoice == 6)
			JOptionPane.showMessageDialog(null, "Nice phone.");
		else if(randomChoice == 7)
			JOptionPane.showMessageDialog(null, "Your wearing a nice hat.");
		else if(randomChoice == 8)
			JOptionPane.showMessageDialog(null, "Your nice.");
		else if(randomChoice == 9)
			JOptionPane.showMessageDialog(null, "You are a good frined.");
		else if(randomChoice == 10)
			JOptionPane.showMessageDialog(null, "Nice jakcet.");
	}
		}
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}

