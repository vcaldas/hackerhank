package introduction;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Problem description
 * https://www.hackerrank.com/challenges/java-loops/problem
 */
public class _07_Java_loops_II {
	private static File f = new File("resources/introduction/input6.txt");
	private static Scanner in = null ;
	
	private static boolean SUBMIT = false;
	public static void main(String[] args) {
		
		setup(SUBMIT);
		

	}


	private static void solution() {
		
		 int t=in.nextInt(); //  get number of lines
		 
	        for(int i=0 ;i <t; i++){
	        	
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	            System.out.println(getSequence(a,b,n));
         
	           
	        }
	        in.close();
	}


//	2 6 14 30 62 126 254 510 1022 2046
//	8 14 26 50 98
	private static String getSequence(int a, int b, int n) {
		String s = "";
		int ith_term = 0;
		for(int i = 0; i< n; i++) {
			
			if(i == 0) {
				int s0 = (a+b);
				s = Integer.toString(s0);
				ith_term = s0;
			}
			else {
				ith_term = ith_term + power(i) * b;
				s = s + " " + Integer.toString(ith_term);
			}
			
			
			
		}
		
		return s;
	}

	private static int power(int n) {
		int s = 2;
		for(int i = 1; i<n; i++) {
			s = s*2;
		}

		return s;
	}


	private static void setup(boolean submit) {
		if(submit) {
			in = new Scanner(System.in);
		}
		else {
			try {
				in = new Scanner(f);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		solution();
		
       	
	}

}
