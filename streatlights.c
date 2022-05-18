#include<stdio.h>
int *streats(int lights[],int n)
{
   static int arr[10];
    while (n--)
    {
        for(int i=0;i<8;i++)
        {
            if(i==0)
            {
                if(lights[i+1]==0)
                arr[i]=0;
                else
                arr[i]=1;
            }
            else if(i==7)
            {
                 if(lights[i-1]==0)
                    arr[i]=0;
                else
                 arr[i]=1;
            }
            else if(lights[i-1]==0&&lights[i+1]==0 || lights[i-1]==1&&lights[i+1]==1)
            {
                arr[i]=0;
            }
            else
                arr[i]=1;
        }

        for(int i=0;i<8;i++)
         lights[i]=arr[i];
    }
        return arr;
    
}
int main()
{
    int a[10],m,*p;
    printf("enter the days");
    scanf("%d",&m);
    printf("enter the streat light condition\n");
    printf("such that 1 means on and 0 means off");
    for(int i=0;i<8;i++)
    {
        scanf("%d",&a[i]);
    }
    p=streats(a,m);
    printf("the streat light status are\n ");
    for(int i=0;i<8;i++)
    {
        printf("%d ",p[i]);
    }
    return 0;
}