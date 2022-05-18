/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class factorial
{
    
    static int factorial(int a)
    {
        if(a==0 || a==1)
        return 1;
        else
        return a*factorial(a-1);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int a=sc.nextInt();
		    a=factorial(a);
		    System.out.println(a);
		}
		
	}
}
