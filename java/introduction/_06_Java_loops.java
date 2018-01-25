package introduction;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Problem description
 * https://www.hackerrank.com/challenges/java-loops-i/problem
 */
public class _06_Java_loops {
	private static File f = new File("resources/introduction/input5.txt");
	private static Scanner scan = null ;
	
	private static boolean SUBMIT = false;
	public static void main(String[] args) {
		
		setup(SUBMIT);
		

	}


	private static void solution() {
		
		 int N = scan.nextInt();
		 
		 // Constraint: 2<= N <= 20
		 
		 if(2<=N && N<=20) {
			 for(int i=1; i<=10; i++) {
				 // Sample output 2 x 1 = 2
				 System.out.format("%d x %d = %d %n", N, i, N*i); 
				 
			 }
			 
		 }

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
