//14:Write a program to check entered number is Armstrong number or not.
import java.util.Scanner;
public class Armstrongno {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		int n,r,sum=0,temp;
		System.out.println("Enter no");
		 n = sc.nextInt();
		 
		 temp = n;
		 
		 while(n>0)
		 {
			    r = n%10; 
		        sum = sum + (r*r*r); 
		        n = n/10; 
		 }
		 if(temp==sum)
		    System.out.println("Given number is Armstrong");
		 else 
			 System.out.println("Given number is not Armstrong"); 
  
	}

}
