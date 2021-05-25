
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Employee Information");
       Scanner sc = new Scanner(System.in);
       int empid;
       String name;
       String address;
       double salary;
       System.out.println("Enter Employee Id");
       empid = sc.nextInt();  //read int value from string
       System.out.println("Enter Name");
       name = sc.next();
       System.out.println("Enter Address");
       address = sc.next();
       System.out.println("Enter Salary");
       salary = sc.nextDouble();
       System.out.println("Empid = "+empid);
       System.out.println("Name = "+name);
       System.out.println("Address = "+address);
       System.out.println("salary = "+salary);
   }

}
