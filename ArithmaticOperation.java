import java.util.Scanner;
public class ArithmaticOperation {

	public static void main(String[] args) {
		int n1,n2;
		int result = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first no:");
		n1 = sc.nextInt();
		
		System.out.println("Enter second no:");
		n2 = sc.nextInt();
		
		result = n1 + n2;
		System.out.println("Addition="+result);
		
		result = n1 - n2;
		System.out.println("Substraction="+result);
		
		result = n1 * n2;
		System.out.println("Multiplication="+result);
		
		if(n2>0)
		{
			result = n2 / n1;
			System.out.println("Division="+result);
		}
		else
		{
			System.out.println("Can't divide by zero");
		}
		
	}

}
