package introduction;

import java.util.Scanner;

/*
 * Problem description
 * https://www.hackerrank.com/challenges/java-static-initializer-block/problem
 */
public class _10_Java_Static_initializer_block {
	
	    static int B;
	    static int H;
	    static boolean flag;

	    static {
	        Scanner sc = new Scanner(System.in);
	        B = sc.nextInt();
	        H = sc.nextInt();
	        
	        if (B > 0 && H > 0) { // Check for positive numbers
	            flag = true; 
	        } else {
	            System.out.println("java.lang.Exception: Breadth and height must be positive");
	            flag = false;
	        }
	    }

	    public static void main(String[] args) {
	        if (flag) {
	            int area = B * H;
	            System.out.print(area);
	        }

	    }//end of main

	}//end of class