package training.assignments.com;
import java.util.*;
import java.io.*;
 public class CubeSum {
		public static void main(String args[]){

		    int num1,num2,num3;
		    Scanner console = new Scanner(System.in);

		    //read the numbers
		    System.out.println("Enter the first number");
		    num1 = Integer.parseInt(console.nextLine());
		    System.out.println("Enter the second number");
		    num2 = Integer.parseInt(console.nextLine());
		    System.out.println("Enter the third number");
		    num3 = Integer.parseInt(console.nextLine());

		    int output = (num1*num1*num1)+(num2*num2*num2)+(num3*num3*num3);
		    System.out.println("result is:  " + output);


		}
		}
