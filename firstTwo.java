package javaPractice;
import java.util.Scanner;

public class firstTwo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int[] number = new int[10];        
		        
		for (int i=0; i<number.length; i++) {
			number[i]= scan.nextInt()%42;
		        	
		    System.out.println(number[i]);
	    	}
		        	}


}
