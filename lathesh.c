#include<stdio.h>
int main()
{
    int max=0,n,rem;
    printf("enter the numbers\n");
    scanf("%d",&n);
    while(n%100>9)
    {
        rem=n%100;
        if(max<rem)
        {
            max=rem;
        }
        n=n/10;
    }

    
    printf("%d",max);
    return 0;
}
