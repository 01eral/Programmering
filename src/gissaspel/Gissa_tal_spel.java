package gissaspel;

import java.util.Scanner;

public class Gissa_tal_spel {

	public static void main(String[] args) {
		boolean guess = false;
		boolean restart = true; 

		Scanner keyboard = new Scanner(System.in);
		
		while (restart) {
		
		int answer = (int) (Math.random() * 100);
		System.out.println("Guess the Number");

		while (!guess) {
			
			int key = keyboard.nextInt();
			
			
			
			if (answer == key) {
				System.out.println("Right guess");
				guess = true;
				restart = false;
			} else {
				
				if (key > answer) {
					System.out.println("lower");
				}
				else {
					System.out.println("higher");
				}
				
				System.out.println("Try again");
				
			}

		}
		
		System.out.println("Do you want to Restart?");  
		
		
	}
		
	}
	// TODO Auto-generated method stub
}
