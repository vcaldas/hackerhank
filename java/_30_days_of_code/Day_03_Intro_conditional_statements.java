package _30_days_of_code;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day_03_Intro_conditional_statements {
	private static File f = new File("resources/_30_days_of_code/day_03.txt");
	private static Scanner scan = null ;
	
	private static boolean SUBMIT = false;
	public static void main(String[] args) {
		
		setup(SUBMIT);
		

	}


	private static void solution() {
		//positive integer
		String ans = "weird";
		int n = scan.nextInt();
		
		 // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
	      if(n%2==1){
	         ans = "Weird";
	      }
	      else if ( 2 <= n &&  n <= 5) {
	    	  	ans = "Not Weird";
	      }
	      else if (6<=n && n<=20 ) {
	    	  	ans = "Weird";
	      }
	      else if (n >20) {
	    	  	ans = "Not Weird";
	      }
		
	      System.out.println(ans);
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
