package Test;
import java.util.Scanner;
public class HarmonicNumber 
{
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter N: ");
	    int num = input.nextInt();
	    if(num != 0){
	      double hp = 0;  
	      for(double i=1 ; i<=num ; i++){
	        double hn = hp + 1/i;   
	        hp = hn;
	      }
	      System.out.println("Harmonic value for " +num+ "is: \n");
	      System.out.println(hp);
	    }else{
	      throw new ArithmeticException("Invalid number");
	    }
	}

}

