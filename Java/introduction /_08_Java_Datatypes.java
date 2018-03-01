package introduction;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Problem description
 * https://www.hackerrank.com/challenges/java-datatypes/problem
 */
public class _08_Java_Datatypes {
	private static File f = new File("resources/introduction/input7.txt");
	private static Scanner in = null ;
	
	private static boolean SUBMIT = false;
	
	private static void solution() {
		int t=in.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=in.nextLong();
                System.out.println(x+" can be fitted in:");
                //byte, short, int, and long):
                /*
                 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
                 */
                // It has a minimum value of -128 and a maximum value of 127 (inclusive)
                if(x>=Byte.MIN_VALUE && x<=Byte.MAX_VALUE)System.out.println("* byte");
                //It has a minimum value of -32,768 and a maximum value of 32,767 (inclusive).
                if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE)System.out.println("* short");
                //minimum value of -2^31 and a maximum value of 2^31 -1.
                if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE)System.out.println("* int");
                //2^63- and a maximum value of 2^63-1.
                if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE)System.out.println("* long");
                
                //Complete the code
            }
            catch(Exception e)
            {
                System.out.println(in.next()+" can't be fitted anywhere.");
            }

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
