package practiceJava.loops;
/*
 * Part 3: For loops
Use the for loop to create a programm that ask the user to input a name and then prints each of the letters of the name
Hint You can use the following String functions:

lenght() -> returns the total number of characters of a given String
chartAt(i) -> returns the character at the given position(i) of a String
Challenge yourself
Write a for loop that makes the counter go from 15 to 30, counting by 3s.
 */


import java.util.Scanner;
public class NameLetterUsingForLoop {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter your name: ");
	        String name = scanner.nextLine();

	        System.out.println("Letters in the name:");
	        for (int i = 0; i < name.length(); i++) {
	            char letter = name.charAt(i);
	            System.out.println(letter);
	        }
	        System.out.println();
	        System.out.println("Counting from 15 to 30 by 3s:");
	        for (int i = 15; i <= 30; i += 3) {
	            System.out.println(i);
	        }
	        scanner.close();
	    }
	}

