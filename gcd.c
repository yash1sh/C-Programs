#include<stdio.h>
int gcd(int n,int m)
{
    if(n%m==0)
    {
        return 0;
    }
    else
    gcd(m,n%m);
}

int main()
{
    int rem,n,m,count,temp;
    printf("enter both numbers");
    scanf("%d %d",&n,&m);
   rem = gcd(n,m);
   printf("gcd is %d",rem);
}