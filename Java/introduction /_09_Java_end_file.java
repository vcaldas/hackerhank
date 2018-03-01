package introduction;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Problem description
 * https://www.hackerrank.com/challenges/java-datatypes/problem
 */
public class _09_Java_end_file {
	private static File f = new File("resources/introduction/input_09.txt");
	private static Scanner in = null ;
	
	private static boolean SUBMIT = false;
	
	private static void solution() {
		int i = 1;
		while(in.hasNext()) {
			String s = in.nextLine();
			System.out.format("%d %s\n", i, s); 
			i++;			
		}
		
		
		
	}

		
		public static void main(String[] args) {
		
		setup(SUBMIT);
	
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
