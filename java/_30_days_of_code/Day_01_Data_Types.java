package _30_days_of_code;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day_01_Data_Types {
	private static File f = new File("resources/_30_days_of_code/day_01.txt");
	private static Scanner scan = null ;
	
	private static boolean SUBMIT = false;
	public static void main(String[] args) {
		
		setup(SUBMIT);
		

	}


	private static void solution() {
		int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
		 /* Declare second integer, double, and String variables. */
        int j;
        double e;
        String t;

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        
        j = scan.nextInt();
        e = scan.nextDouble();
        scan.nextLine();
        t = scan.nextLine();
     
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + j);
               
        /* Print the sum of the double variables on a new line. */
        System.out.println(e + d);
       
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        System.out.println(s + t);
	}



	private static void setup(boolean submit) {
		if(submit) {
			scan = new Scanner(System.in);
		}
		else {
			try {
				scan = new Scanner(f);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		solution();
		
       	
	}

}
