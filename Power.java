//4 Write a program to calculate power of a number.
import java.util.Scanner;
public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Power of Number");
       Scanner sc = new Scanner(System.in);
       
       int base,exp,result = 1;
       System.out.println("Enter base of number");
       base = sc.nextInt();
       
       System.out.println("Enter exponent of number");
       exp = sc.nextInt();
       
       while(exp!=0)
       {
            result = base * result;
            --exp;
	   }
       System.out.println("Power of Given number= "+result);

}
}