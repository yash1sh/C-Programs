#include<stdio.h>
int main()
{
    int i,j,n,k,a[50],count;
    printf("enter the size of array\n");
    scanf("%d",&n);
    printf("enter the elements\n");
    for(i=0;i<n;i++)
    scanf("%d",&a[i]);
    printf("enter the key\n");
    scanf("%d",&k);
    for(i=0;i<k;i++)
    {
        count=0;
        for(j=i;j<k-1;j++)
        {
        if(a[j]>a[j+1])
        {
            a[j]^=a[j+1]^=a[j]^=a[j+1];
            count+=1;
        }
        }

        if(count==0)
        {
            break;
        }
    }
    for(i=k;i<n;i++)
    {
        count=0;
        for(j=i;j<n-1;j++)
        {
        if(a[j]<a[j+1])
        {
            a[j]^=a[j+1]^=a[j]^=a[j+1];
            count+=1;
        }
        }
        if(count==0)
        {
            break;
        }
    }
    for(i=0;i<n;i++)
    printf("%d",a[i]);
    return 0;
}