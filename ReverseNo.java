//12: Write a  program to enter a number and print its reverse.
import java.util.Scanner;
public class ReverseNo {

	public static void main(String[] args) {
		
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter no for reversing:");
     int n,rev=0,temp = 0,rem;
     n = sc.nextInt();
     
     while(n>0)
     {
    	rem = n%10;
    	rev = rev * 10 +rem;
    	n/=10;
     }
     System.out.println("Reverse of "+n+"is : "+rev);
     sc.close();
   
	}

}
