#include<stdio.h>
int main()
{
    int n,d,f1=0,f2=1,f3;
    printf("enter the fibonacci range\n");
    scanf(" %d",&n);
    printf("%d %d",f1,f2);
    while(n-2>0)
    {
        f3=f2;
        f2=f1+f2;
        f1=f3;
        printf(" %d",f2);
        n--;
    }
    printf("enter the position of the number");
    scanf("%d",&d);
    return 0;
}