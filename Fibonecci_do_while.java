package practiceJava.loops;

/*Part 2: Do While loops
Create a new Java class with a main method(so you can run your code) called Fibonacci

The Fibonacci numbers are a traditional computer science problem: "each number is the sum of the two preceding ones, starting from 0 and 1."

The beginning of the sequence is thus:

0 1 1 2 3 5 8 13 21 34 55 89 ...

Add the following import to be able to capture user input n

  import java.util.Scanner;
Implement a Do While loop that calculates Fibonacci(n)

n	Fibonacci(n)
0	0
1	1
2	1
3	2
4	3
5	5
6	8
7	13
...	...
*/
import java.util.Scanner;
public class Fibonecci_do_while {

	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number (n) to calculate Fibonacci(n): ");
	        int n = scanner.nextInt();

	        int first = 0;
	        int second = 1;
	        int count = 0;

	        System.out.println("Fibonacci Series up to " + n + ":");
	        if (n >= 1) {
	            System.out.print(first + " ");
	        }
	        if (n >= 2) {
	            System.out.print(second + " ");
	        }

	        do {
	            int next = first + second;
	            System.out.print(next + " ");
	            first = second;
	            second = next;
	            count++;
	        } while (count < n - 2);

	        scanner.close();
	    }
	}
