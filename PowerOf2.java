package Test;
import java.util.Scanner;
public class PowerOf2 
{
	public static void main(String [] args) {

	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter N: ");
	    int pow = scan.nextInt();

	    if( pow <= 0 || pow <5){


	      for(int i=0; i<=pow ; i++){
	    	  System.out.println("Power of 2: "+(int)Math.pow(2,i));
	      }

	    }else{

	      System.out.println("Value overflows int value, try again!");

	    }
	  }

}

