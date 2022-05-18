#include<stdio.h>
int a[10];
int insertionsort(int n)
{
    int i,j,key;
    for(i=1;i<n;i++)
    {
        key=a[i];
        j=i-1;
        while(j>=0 && a[j]>key)
        {
            a[j+1]=a[j];
            j--;
        }
        a[j+1]=key;
    }
    for(i=0;i<n;i++)
    {
        printf("%d",a[i]);
    }
}
void main()
{
    int i,n;
    printf("enter the number of arrays\n ");
    scanf("%d",&n);
    printf("elemts are\n");
        for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    printf("after insertionsort\n");
    insertionsort(n);
}