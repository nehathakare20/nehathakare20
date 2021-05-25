//2:Write a program to adddition of two numbers also addition of two characters.
import java.util.Scanner;
public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Printing Addition");
      Scanner sc = new Scanner(System.in);
      int num1,num2;
      int addition;
      
      System.out.println("Enter num1:");
      num1 = sc.nextInt();
      
      System.out.println("Enter num2:");
      num2 = sc.nextInt();
      
      addition = num1+num2;
      System.out.println("Addition = "+addition);
      
       String s1, s2;
		
	  System.out.println("Enter the first String");
	  s1 = sc.next();
		
	  System.out.println("Enter the second String");
	   s2 = sc.next();
		
	 System.out.println("After Concatenantion = "+s1+" "+s2);
      
      
      
	}

}
