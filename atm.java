/* package codechef; // don't place package name! */

import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class atm
{
	public static void main(String [] args)
	{
       Scanner s =new Scanner(System.in);
       int amount = s.nextInt();
       double balance = s.nextDouble();
       s.close();
       double leftbalance;
       if(amount % 5==0 && ((double)amount+0.50<balance))
       {
        leftbalance = balance - (amount+0.50);
           System.out.printf("%.2f",leftbalance);
       }
      else
      {
           leftbalance=balance;
           System.out.printf("%.2f",leftbalance);
       }
      }
	}
 

