/*1-Accept  i/ps from User , till user enters "quit" or any other option.
I/P : operation(add|sub|mult|div) , number1(double) , number2(double) 
Display the result of the operation.
It should be done in a loop , till user enters "quit"*/

import java.util.*;
public class ArithmaticOperation
{
    public static void main(String[] args){
        System.out.println("1.Add,2.Sub,3.Mul,4.Div");
        Scanner sc = new Scanner(System.in);
        boolean flag=true;
        System.out.println("Enter Two no.");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        while(flag==true)
        {
            System.out.println("Enter choice:");
            String ch = sc.next();

            switch(ch)
            {
               case "1":
               {
                   System.out.println("Sum= "+(num1 + num2));
                   continue;
               }
               case "2":
               {
                   System.out.println("Sub= "+(num1 - num2));
                   continue;
               } 
               case "3":
               {
                   System.out.println("Mul= "+(num1 * num2));
                   continue;
               } 
               case "4":
               {
                   if(num2>0)
                   {
                     System.out.println("Div= "+(num1 / num2));
                     
                   }
                   break; 
               } 
               case "quit":
               {
                   flag=false;
                   break;
               }  
            }

        }
        sc.close();
    }
}
