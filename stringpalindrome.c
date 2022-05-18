#include<stdio.h>
#include<string.h>
int main()
{
    char s[10],count,temp;
    printf("enter the name\n");
        scanf("%s",s);
        count=strlen(s);
    for(int i=0;i<count;i++)
    {
        if(s[i]==s[count-i-1])
        temp=1;
    }
    if(temp==0)
        printf("not a palindrome");
    else
        printf("is a palindrome");
}
