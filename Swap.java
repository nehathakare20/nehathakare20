//5:Write a program to swap two numbers.
import java.util.Scanner;
public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Swapping of no");
      Scanner sc = new Scanner(System.in);
      
      int a,b,temp;
      System.out.println("Enter number1");
      a = sc.nextInt();
      
      System.out.println("Enter number2");
      b = sc.nextInt();
      
      System.out.println("Numbers before Swapping="+a+" "+b);
       
      temp = a;
      a = b;
      b = temp;
     System.out.println("Numbers After Swapping="+a+" "+b);
	}

}
