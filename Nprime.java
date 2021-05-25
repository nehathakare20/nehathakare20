//Write a  program to print all Prime numbers between 1 to n. 

import java.util.Scanner;
public class Nprime {

	public static void main(String[] args) {
		
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter no:");
	 int n = sc.nextInt();
//	 int count=0;
//	 n = sc.nextInt();
	 boolean flag = true;
	 System.out.println("Print prime no from 1 to "+n+":");
	 for(int i = 2;i<=n;i++)
	 {
		 for(int j = 2;j<i/2;j++) 
		 {
			 if(i%j == 0) 
			 {
				 flag = false;
				 break;
			 }
		 }
		 if(flag==true)
	     System.out.println(i);
	 }
	 sc.close();
	}

}
