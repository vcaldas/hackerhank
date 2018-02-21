package challenges;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.ArrayList;

import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Journey_to_the_moon {
	private static File f = new File("resources/challenges/to_the_moon.txt");
	private static Scanner scan = null ;
	static ArrayList<ArrayList<Integer>> groups = new ArrayList<ArrayList<Integer>>();
	//private static List<Integer> groups = new ArrayList<Integer>();
	private static boolean SUBMIT = false;
	
	
	// Expected result 4999949998
	public static void main(String[] args) {
		setup(SUBMIT);
		

	}


	private static void solution() {
		//Scanner in = new Scanner(System.in);
        int n = scan.nextInt();
        int p = scan.nextInt();
        int[][] astronaut = new int[p][2];
        for(int astronaut_i = 0; astronaut_i < p; astronaut_i++){
            for(int astronaut_j = 0; astronaut_j < 2; astronaut_j++){
                astronaut[astronaut_i][astronaut_j] = scan.nextInt();
            }
        }
        // Need to lalter the code because the result is long, not int for a test
        long result = journeyToMoon(n, astronaut);
        System.out.println(result);
        scan.close();
    }
	
	static long journeyToMoon(int N, int[][] astronaut) {
				
		//Initialize each astronaut's compatriots
	    final List<List<Integer>> compatriots = new ArrayList<List<Integer>>(N);
	    
	    for(int i = 0; i < N; ++i){
	    		compatriots.add(new ArrayList<Integer>());
	    	}
	    //System.out.println("Compatriots size: " +  compatriots.size());
	    
	    //Get each astronaut's compatriots
	    for(int i=0; i< astronaut.length; i++) {
	    		int A = astronaut[i][0];
	    		int B = astronaut[i][1];
	    		compatriots.get(A).add(B);
	    		compatriots.get(B).add(A);
	    	}
	
////	    Just for checking
//	    for(int i =0; i< compatriots.size(); i++) {
//	    		System.out.println("Compatriots index " + i + " " +  compatriots.get(i));
//	    }
//	    
	    //
	    boolean[] isVisited = new boolean[N];
	    
	    
	    List<Integer> countrySizes = new ArrayList<Integer>();
	    
	    for(int i = 0; i < N; ++i){
	   		int countrySize = 0;
	    		final Queue<Integer> q = new ArrayDeque<Integer>();

	    		//Start pool with the index of the Astronaut
	    		q.add(i);
	    			    		
	      do {
	    	  	//Get the astronautID and leave the rest
	    	  	// This guarantees the concatenation
	        int astronautId = q.poll();
	        
//    			System.out.println("AstronautID " + astronautId);
	        // Initialize a given astronaut count
    			
    			// If not visited, add 1 to count and change to visited
    			// Add other itens to q.
    			// add the counter, since we are still on index i.
    			
	        if(!isVisited[astronautId]){
	          ++countrySize;
	          isVisited[astronautId] = true;
	          q.addAll(compatriots.get(astronautId));
	        }
	      } while (!q.isEmpty());
	      
	      if(countrySize > 0){
	        countrySizes.add(countrySize);
	      }
	      
	      
	}
	   
	    
	    //Get number of possible combinations
	    long combinations = 0L;
	    long totalAstronauts = N;
	    
	    for(int countrySize : countrySizes){
	    	
	    		combinations += countrySize * (totalAstronauts -= countrySize);
	    		System.out.println(combinations);
	}
	    
        return combinations;
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

