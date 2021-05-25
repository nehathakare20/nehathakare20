//15:Write a program to find greatest of three numbers using nested if-else.
import java.util.Scanner;
public class MaximumOfThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b,c;
		System.out.println("Enter first no:");
		a = sc.nextInt();
		System.out.println("Enter second no:");
		b = sc.nextInt();
		System.out.println("Enter third no:");
		c = sc.nextInt();
        
		if(a>=b)
		{
			if(a>=c)
			{
				System.out.println("Maximum no:"+a);
			}
			else 
			{
				System.out.println("Maximum no:"+c);
			}
		}
		if(b>=a)
		{
			if(b>=c)
			{
				System.out.println("Maximum no:"+b);
			}
			else 
			{
				System.out.println("Maximum no:"+c);
			}
		}
		sc.close();
		
}
}