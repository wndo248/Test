package javaPractice;
import java.util.Scanner;
public class firstOne {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] score;
		int C = scan.nextInt();
		int N = scan.nextInt();
		score = new int[N];
		double aver = 0;
		int sum = 0;
		int c = 0;
		for(int i = 0; i <C; i++) { 
          for(int j = 0; j < score.length; j++) {
        	  score[j] = scan.nextInt();
              sum = sum + score[j];
          }
          aver =(double)sum /N;
          for(int z = 0; z < N; z++) {
        	  if(aver < score[z])
        		  c++;
          }
        
          System.out.println(String.format("%.3f",100*(double)c/N) + "%");
          }
		
	}
	
}
