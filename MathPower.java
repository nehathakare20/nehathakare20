//7:Write a program to find m to the power n
import java.util.Scanner;
public class MathPower {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int n,m;
		System.out.println("Enter no");
		m = sc.nextInt();
		
		System.out.println("Enter power");
		n = sc.nextInt();
		
		System.out.println("Power " +m+"^"+n+"  "+Math.pow(m, n));
		sc.close();
	}

}
