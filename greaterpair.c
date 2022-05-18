#include<stdio.h>
int main()
{
    int temp=0,n,res;
    printf("enter the numbers\n");
    scanf("%d",&n);
        while(n%100>9)
        {
            res=n%100;
            if(temp<res)
            {
                temp=res;
            }
            n=n/10;
        }
    printf("gretest num %d",temp);
}



