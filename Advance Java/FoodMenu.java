/*3. Display food menu to user. User will select items from menu along with the quantity. (eg 1. Dosa 2. Samosa .......10 . Generate Bill ) Assign fixed prices to food items
When user enters 'Generate Bill' option(10) , display total bill & exit.*/
import java.util.*;
public class FoodMenu
{
    public static void main(String[] args){
    
    String order;
    double price;
    int ch;
    //double total=0;
    double bill=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("MENU");
    System.out.println("1.Dosa");
    System.out.println("2.Idali");
    System.out.println("3.Misal");
    System.out.println("4.VadaPav");
    System.out.println("5.Coffee");
    System.out.println("6.SevPuri");
    System.out.println("7.Panipuri");
    System.out.println("8.Icecream");
    System.out.println("9.Tea");
    System.out.println("10.Generate Bill");
    boolean flag=true;
    while(flag!=false)
    {
     System.out.println("Enter Choice:");  
     ch=sc.nextInt();
     switch(ch)
     {
        //  double total1=0;
        //  double total2=0;
        //  double total3=0;
        //  double total4=0;
        //  double total5=0;
        //  double total6=0;
        //  double total7=0;
        //  double total8=0;
        //  double total9=0;
         case 1:
                System.out.println("Order:Dosa \nQuantity: ");
                int q = sc.nextInt();
                double total1=0;
                price=60.00;
                total1=total1+(price*q);
                System.out.println("Bill=" +total1);
                break;
         case 2:
                System.out.println("Order:Idali \n Quantity: ");
                int q1 = sc.nextInt();
                double total2=0;
                price=70.00;
                total2=total2+(price*q1);
                System.out.println("Bill=" +total2);
                break;
         case 3:
                System.out.println("Order:Misal \n Quantity: ");
                int q2 = sc.nextInt();
                double total3=0;
                price=40.00;
                total3=total3+(price*q2);
                System.out.println("Bill=" +total3);
                break;
         case 4:
                System.out.println("Order:VadaPav \n Quantity: ");
                int q3 = sc.nextInt();
                double total4=0;
                price=20.00;
                total4=total4+(price*q3);
                System.out.println("Bill=" +total4);
                break;
         case 5:
                System.out.println("Order:Coffee \n Quantity: ");
                int q4 = sc.nextInt();
                double total5=0;
                price=30.00;
                total5=total5+(price*q4);
                System.out.println("Bill=" +total5);
                break;
         case 6:
                System.out.println("Order:SevPuri \n Quantity: ");
                int q5 = sc.nextInt();
                double total6=0;
                price=20.00;
                total6=total6+(price*q5);
                System.out.println("Bill=" +total6);
                break;
         case 7:
                System.out.println("Order:Panipuri \n Quantity: ");
                int q6 = sc.nextInt();
                double total7=0;
                price=15.00;
                total7=total7+(price*q6);
                System.out.println("Bill=" +total7);
                break;
         case 8:
                System.out.println("Order:Icecream \n Quantity: ");
                int q7 = sc.nextInt();
                double total8=0;
                price=20.00;
                total8=total8+(price*q7);
                System.out.println("Bill=" +total8);
                break;
         case 9:
                System.out.println("Order:Tea \n Quantity: ");
                int q8 = sc.nextInt();
                double total9=0;
                price=20.00;
                total9=total9+(price*q8);
                System.out.println("Bill=" +total9);
                break;
         case 10:
                System.out.println("Generate Bill:");
                // bill=total1 + total2 + total3 + total4 + total5 + total6 + total7 + total8 + total9;
                // System.out.println("Total Bill: " +bill);
                break;
         case 11:
                flag=false;
                System.out.println("Invalid Choice");       
     }
     
    }
    sc.close();

    }
}