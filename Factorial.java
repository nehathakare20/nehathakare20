//6:Write a program to find factorial of a given number.
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      int i,fact=1,num;
      System.out.println("Enter no for finding Factorial");
      num = sc.nextInt();
      
      for(i=1;i<=num;i++)
      {
    	  fact = fact * i;
      }
      System.out.println("Factorial="+fact);
      
	}

}
