package headortail;

import java.util.Scanner;

public class project1 {
	
	public static void main(String[] args) {
		
		System.out.print("\n The Coin Flip is: head");
		System.out.print("\n The Coin Flip is: tail");
		
		System.out.print("\n head is 1");
        System.out.print("\n tail is 2");

        Scanner input = new Scanner(System.in);
        System.out.print("\n Enter head or tail:");
        int userInput = input.nextInt();
        
        if (userInput == 1|| userInput ==2) {
        	int coinFlip = (int) (Math.random() * 2);
        	System.out.println("Flip the coin...");

        if (coinFlip == 1) {
        	System.out.println("head");
        }
        else {
        	System.out.println("tail");

        }
        }
        
       
	}
	}



