/*2. Accept 2 double values from User (using Scanner). Check data type.
. If arguments are not doubles , supply suitable error message & terminate.
If numbers are double values , print its average.*/

import java.util.*;
public class DoubleAvg
{
    public static void main(String[] args){
        double avg;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two no:");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        if((num1 == Math.floor(num1)) && (num2 == Math.floor(num2)))
        {
             System.out.println("Error");
        }
        else
        {
             avg = (num1+num2)/2;
             System.out.println("Average= "+avg);
        }
        sc.close();
    }
     
}
