#include<stdio.h>
int main()
{
    int n,arr[10],k,m=0,j,r;
    printf("enter the size:\n");
    scanf("%d",&n);
    printf("how much you want to shift");
    scanf("%d",&k);
    printf("enter the array elements");
    for(int i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    for(int i=0;i<k;i++)
    {
        r=arr[m];
        for(j=0;j<n-1;j++)
        {
            arr[j]=arr[j+1];
        }
        arr[j]=r;
    }
        
    for(int j=0;j<n;j++)
    {
        printf("%d ",arr[j]);
    }
return 0;
}