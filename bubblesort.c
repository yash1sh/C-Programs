//bubble sort 
#include<stdio.h>

int main()
{
    int n,a[10],count;
    
    printf("enter the size of array\n");
    scanf("%d",&n);
    
    printf("enter the elements:\n");
    for(int i=0;i<n;i++)
    scanf("%d",&a[i]);
    
    for(int i=0;i<n-1;i++)
    {
        for(int j=0;j<n-i-1;j++)
        {
            count=0;
            if(a[j]>a[j+1])
            {
            a[j]^=a[j+1];   //swapping the data these two memory location
            a[j+1]^=a[j];
            a[j]^=a[j+1];
            count=1;
            }
        }
        
        if(count==0)
        break;
    }
    printf("after sorting\n");
      for(int i=0;i<n;i++)
    printf("%d ",a[i]);
    return 0;
}
