#include<stdio.h>
void primes(int n)
{
    if(n==0 || n==1)
    return 0;
    if(n==2 || n==3)
    return 0;
    if(n%2==0 || n%3==0)
    return 0;
    for(int i=5;i*1<n;i=i+6)
    {
        if(n%i==0 || n%(i+2)==0)
        return 0;
    }
    return 1;
}
int main()
{
    int n;
    printf("enter the number\n");
    scanf("%d",&n);
    if(primes(n));
    {
    printf("is a prime no\n");
    }
    else
    {
    printf("not a prime\n");
    }
}