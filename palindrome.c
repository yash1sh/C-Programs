/*
given number is a palindrome or not
*/

#include<stdio.h>
int main()
{
    int n,r,rev=0,temp;
    printf("enter the number");
    scanf(" %d",&n);
    temp=n;
    while(n>0)
    {
        r=n%10;
        rev=rev*10+r;
        n=n/10;

    }
    printf("the reverse number is: %d\n",rev);
    if(temp==rev)
    {
        printf("its a palindrome\n");
    }
    else
    {
        printf("not a palindrome\n");
    }
    return 0;
}