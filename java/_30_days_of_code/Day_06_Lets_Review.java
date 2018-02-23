package _30_days_of_code;

import java.io.*;
import java.util.*;

public class Day_06_Lets_Review {

	   
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt(); 
        in.nextLine();
           
        //for(int i =1; i<=testCases+1; i++){
        while(in.hasNext()){
            String word = in.nextLine();
            print_result(word);
        }
        in.close();
    }
    
    public static void print_result(String word){
        // odd separated characters
        String odds = "";
        String evens = "";
        
        for(int i=0; i<word.length(); i++){
            if(i % 2 == 0){
                evens += word.charAt(i); 
            }
            else{
                odds += word.charAt(i);
            }
            
        }
        
        System.out.println(evens + " " + odds);
        
    }
}