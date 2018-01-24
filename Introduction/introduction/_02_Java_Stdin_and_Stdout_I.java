package introduction;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _02_Java_Stdin_and_Stdout_I {
	private static File f = new File("resources/introduction/input1.txt");
	private static Scanner scan = null ;
	
	private static boolean SUBMIT = false;
	public static void main(String[] args) {
		
		solution(SUBMIT);
		

	}


	private static void solution(boolean submit) {
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
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
		
	}

}
