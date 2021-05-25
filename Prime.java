//8:Check if number is a prime number or not.
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      
      int num,i;
      boolean f = false;
      
      System.out.println("Enter no");
      num = sc.nextInt();
      
      for(i=2;i<=num/2;i++)
      {
    	  if(num%2==0)
    	  {
    	    f = true;
    	    break;
    	  }
      }
      if(f==false)
        System.out.println(+num+" "+"is a prime no.");
      else
    	  System.out.println(+num+" "  +"is not a prime no.");
	}
	
	
	

}
