//10:Check whether the number is palindrome or not?
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
      
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to check");
		int num = sc.nextInt();
        int temp = num,sum=0;
      
      while(num!=0)
      {
    	  int rem=num%10;
    	  sum = sum * 10 + rem;
    	  num/=10;
    	  
      }
      if(temp==sum)
    	  System.out.println("\nGiven number is palindrome");
      else
    	  System.out.println("\nGiven number is not palindrome");
      
      
      sc.close();
      
	}

}
