#include<stdio.h>
void main()
{
    int a[5];
    int b=0;
    printf("enter the array elements\n");
    for(int i=0;i<5;i++)
    scanf("%d",&a[i]);
    for(int i=0;i<5;i++)
    {
        if(a[i]==0)
             printf("%d it  a 0\n",a[i]);
        else if(a[i]%2==0)
        {
            printf("%d even\n",a[i]);
            a[b]^=a[i]^=a[b]^=a[i];
            b++;
        }
        else if(a[i]%2!=0)
            printf("%d odd\n",a[i]);
            
    }
    for(int i=0;i<5;i++)
    {
        printf("%d\t",a[i]);
    }
}