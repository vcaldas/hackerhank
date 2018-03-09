import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        // Loop on each hourglass
        int maxValue = 0;
        
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                int value = arr[i][j]+arr[i][j+1]+arr[i][j+2] // First row
                    + arr[i+1][j+1] // Center of hourglass
                    + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                if(value > maxValue){
                    maxValue = value;
                }
            }
                   
        } 
        System.out.println(maxValue);
            
        
        
    }
}
