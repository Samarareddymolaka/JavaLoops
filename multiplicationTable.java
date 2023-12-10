package practiceJava.loops;
import java.util.Scanner;
public class multiplicationTable {

	   public static void main(String[] args)
	    {
	        Scanner console = new Scanner(System.in);
	        int num;
	        
	        System.out.print("Enter any positive integer: ");
	        num = console.nextInt();
	       if(num<0) {
	   
	    	   System.out.println("Please Enter valid number");
	       }
	     else {
            System.out.println("Multiplication Table of " + num + ":");
 
	   
	        
	       //TODO implement While loop to get print result
	        int multiplier = 1;
	        while (multiplier <= 10) {
	            int result = num * multiplier;
	            System.out.println(num + " * " + multiplier + " = " + result);
	            multiplier++;
	        }

	        console.close();
	    }
	}
}
            