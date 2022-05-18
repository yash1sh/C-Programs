#include<stdio.h>
void fib(int n)
{
    int f1=0,f2=1,f3;
    printf("%d",f2);
    n=n-1;
    while(n>0)
    {
        f3=f2;
        f2=f1+f2;
        f1=f3;
        n--;
    }
    printf("%d",f2);
}
void prime(int x)
{
 for(int i=1;i<=n;i++)
 {
     for(int j=2;j<;j++)

         }
     }
 }
}
void main()
{
    int m;
    printf("enter the position");
    scanf("%d"&m);
    if(m%2==0)
    {
        prime(m/2);
    }
    else
        {
            fib(m/2+1);
            
        }
}