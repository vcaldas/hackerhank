package _30_days_of_code.Day_05;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for(int i = 1; i<= 10; i++){
            System.out.format("%d x %d = %d%n", n,i,n*i);
        }
    }
}
