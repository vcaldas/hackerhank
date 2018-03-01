import java.io.*;
import java.util.*;

public class Solution {

    public static String to_binary(int n){
        String s = "";
        
        while (n > 0)
        {
            s =  ( (n % 2 ) == 0 ? "0" : "1") +s;
            n = n / 2;
        }
        return s;
    }
    
    public static int count_ones(String binary){
        int count = 1;
        int max_count = 1;
        
        for(int i = 1; i<binary.length(); i++){
            if((binary.charAt(i-1)== binary.charAt(i)) && (binary.charAt(i) == '1')){
                count +=1;
                 if(count >= max_count){
                     max_count = count;
                 }
              
            }
                    
            
        else{
            count = 1;
        }
            
        }
        return max_count;
        
    }
        
      
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        

        System.out.println(count_ones(to_binary(n)));
              
        
        
    }
}