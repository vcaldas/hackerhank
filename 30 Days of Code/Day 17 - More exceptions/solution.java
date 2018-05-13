import java.util.*;
import java.io.*;

//Write your code here
class Calculator{
    
    int power(int n, int p) throws Exception{
        
        // error handling
        if (n <0  || p < 0) {
            throw new Exception("n and p should be non-negative");
        }
        else{
            int result = 1;
            for (int i=1; i<=p ; i++){
                // Otherwise use Math.pow(n,p)
                result *= n;
            }
            return result;
        }
        
    }
}


class Solution{

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}

