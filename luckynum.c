#include<stdio.h>
int main()
{
    int n,res;
    printf("enter the number");
    scanf("%d",&n);
res = n%9==0? 9:n%9;
printf("lucky number is %d",res);
}