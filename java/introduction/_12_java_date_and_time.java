package introduction;

import java.time.LocalDate;
import java.util.Scanner;
//https://www.hackerrank.com/challenges/java-date-and-time/problem
public class _12_java_date_and_time {
	
    public static String getDay(String day, String month, String year) {
    		String weekday = "";
    		
        int DD = Integer.parseInt(day);
		int MM = Integer.parseInt(month);
		int YY = Integer.parseInt(year);

        LocalDate dt = LocalDate.of(YY, MM, DD);
        
        int n = dt.getDayOfWeek().getValue();
        
        
        //System.out.println(n);
		     
        switch (n) {
        case 1:  weekday = "SUNDAY";  break;
        case 2:  weekday = "MONDAY"; break;
        case 3:  weekday = "TUESDAY"; break;
        case 4:  weekday = "WEDNESDAY"; break;
        case 5:  weekday = "THRUSDAY"; break;
        case 6:  weekday = "FRIDAY"; break;
        case 7:  weekday = "SATURDAY"; break;
               
    }	
		return weekday;
		
        
    }
    
  
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        System.out.println(getDay(day, month, year));
    }

}
