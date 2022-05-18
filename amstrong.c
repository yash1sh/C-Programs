#include<stdio.h>
#include<math.h>
int main(){
     int n,count=0,sum=0,temp,r;
     printf("Enter the number:");
     scanf("%d",&n);
     temp=n;
     while(n>0)
     {
      count++;
      n=n/10;
     }
     n=temp;
     while(n>0)
     {
         r=n%10;
         sum=sum+(int)pow(r,count);
         n=n/10;
         
     }
     if(sum==temp)
     {
     printf("the given number %d is an amstrong",sum);
     }
     else
     {
         printf("the given number %d is not a amstrong",temp);
     }
     return 0;
}
