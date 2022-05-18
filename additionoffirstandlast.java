/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class additionoffirstandlast
{
    static int zero(int n)
    {
        int count=1;
        while(n!=0)
        {
            n=n/10;
            count*=10;
        }
        return count/10;
     
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int n=sc.nextInt();
	        int a=zero(n);
	        System.out.println((n%10)+(n/a));
		}
	        
	}
}
