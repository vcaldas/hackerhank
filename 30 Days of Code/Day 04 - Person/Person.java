package _30_days_of_code.Day_04;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/30-class-vs-instance/problem
	
public class Person {
	    private int age;	
	  
	    public Person(int initialAge) {
	        this.age = initialAge;
	     }

	 	public void amIOld() {
	         String message = "";
	         if(age <=0){
	             age = 0;
	             message = "You are young.";
	             System.out.println("Age is not valid, setting age to 0.");
	         }else if(age < 13 ){
	             message = "You are young.";
	         } else if(age >=13 && age <18){
	             message = "You are a teenager.";
	         } else{
	             message = "You are old.";
	         }
	   		// Write code determining if this person's age is old and print the correct statement:
	         System.out.println(message);
	 	}

	 	public void yearPasses() {
	         this.age++;
	     }

		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int T = sc.nextInt();
			for (int i = 0; i < T; i++) {
				int age = sc.nextInt();
				Person p = new Person(age);
				p.amIOld();
				for (int j = 0; j < 3; j++) {
					p.yearPasses();
				}
				p.amIOld();
				System.out.println();
	        }
			sc.close();
	    }

}
