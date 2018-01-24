package introduction;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class __05_Output_Formating {
	private static File f = new File("resources/introduction/input4.txt");
	private static Scanner scan = null ;
	
	private static boolean SUBMIT = false;
	public static void main(String[] args) {
		
		setup(SUBMIT);
		

	}


	private static void solution() {
		System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=scan.next();
            int x= scan.nextInt();
            System.out.format("%-15s%03d%n", s1, x);            }
        System.out.println("================================");
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
