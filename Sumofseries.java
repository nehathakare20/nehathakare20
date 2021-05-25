/*9:Sum of series :
	1+2+3+….+n*/
import java.util.Scanner;
public class Sumofseries {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num,i,sum=0;
		System.out.println("Enter the number");
		num = sc.nextInt();
		
		for(i=0;i<=num;i++)
		{
			sum = sum+i;
		}
		System.out.print("\nAddition of 1 to "+num+ " = "+sum);
		
		sc.close();

	}

}
