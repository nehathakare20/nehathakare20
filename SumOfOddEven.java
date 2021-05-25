//Write a  program to find sum of all even and odd numbers between 1 to n
import java.util.Scanner;
public class SumOfOddEven {

	public static void main(String[] args) {
		
	System.out.println("Sum of Odd and Even no");
	Scanner sc = new Scanner(System.in);
	
	int num,even_sum=0,odd_sum=0;
	System.out.println("Enter number");
	 
	num = sc.nextInt();
	
	for(int i = 0;i <= num;i++)
	{
		if(i%2==0)
		{
			even_sum = even_sum + i;
		}
		else
		{
			odd_sum = odd_sum + i;
		}
	}
	System.out.println("Addition of even numbers from 1 to "+num+" = "+even_sum);
	System.out.println("Addition of odd numbers from 1 to "+num+" = "+odd_sum);
    		
	sc.close();
	
	}

}
