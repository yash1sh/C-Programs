#include<stdio.h>
void primes(int N)
{
    int a[N+1];
    for(int i=0;i<=N;i++)
    {
        a[i]=1;
    }
    for(int i=2;i*i<=N;i++)
    {
        if(a[i]==1)
        {
            for(int j=i*i;j<=N;j=j+i)
            {
                if(j%i==0)
                a[j]=0;
            }
        }
    }
    printf("the primes are\n");
    for(int i=2;i<=N;i++)
    {
        if(a[i]==1)
        printf("%d\n",i);
    }
}
int main()
{
    int n;
    printf("enter the number\n");
    scanf("%d",&n);
    primes(n);
    return 0;
}