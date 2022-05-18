#include<stdio.h>
int main()
{
    int a,n[10],sum[10],res;
    printf("enter the size\n");
    scanf("%d",&a);
    printf("enter the numbers\n");
    for(int i=0;i<a;i++)
    scanf("%d",&n[i]);
    for(int i=0;i<a;i++)
    {
        sum[i]=n[i]*10+n[i+1];
    }
    for(int i=0;i<a;i++)
    {
        if(sum[i]>sum[i+1])
        {
            res = sum[i];
        }

    }  
    printf("great pair is %d",res);
}