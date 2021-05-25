/*Find the compound amount and compound interest on the principal Rs.20,000 borrowed at 6% compounded annually 
for 3 years.*/
//import java.util.Scanner;
public class Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Compound Interest");
        //Scanner scanner = new Scanner(System.in);
        
        int p = 20000;
        int r = 6;
        int n = 3;
        double amount;
        double interest;
        
        amount = p * ((1 + r/n)^n);
        System.out.println("Amount = "+amount);
        interest = amount-p;
        System.out.println("Compound Interest="+interest);
        
        
	}

}
