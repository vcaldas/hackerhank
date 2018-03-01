
package introduction;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _03_Java_If_else {
	private static File f = new File("resources/introduction/input2.txt");
	private static Scanner scan = null ;
	
	private static boolean SUBMIT = false;
	public static void main(String[] args) {
		
		setup(SUBMIT);
		

	}


	private static void solution() {
        int n= scan.nextInt();            
        String ans ="";
        
        if(n%2==1){
          ans = "Weird";
        }
        else{
        	 	if((2<=n && n<=5) || n> 20){
                 ans = "Not Weird";
             }
        	 	else{
                  ans = "Weird";
             }
            
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
