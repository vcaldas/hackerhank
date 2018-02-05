package _30_days_of_code;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day_02_Operators {
	private static File f = new File("resources/_30_days_of_code/day_02.txt");
	private static Scanner scan = null ;
	
	private static boolean SUBMIT = false;
	public static void main(String[] args) {
		
		setup(SUBMIT);
		

	}


	private static void solution() {
		double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
         Double tip = mealCost * tipPercent / 100;
        Double tax = mealCost * taxPercent/ 100;
       
      
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(mealCost + tip + tax);
      
        
        
        // Print your result
        System.out.format("The total meal cost is %d dollars.", totalCost);
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
