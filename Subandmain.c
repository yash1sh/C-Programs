#include<stdio.h>
#include<string.h>
int main()
{
    int temp=0,a,b;
    char s1[10],s2[10];
    char *p=s1,*q=s2;
    printf("enter the main string\n");
    fgets(s1,10,stdin);
    printf("enter the sub string\n");
    fgets(s2,10,stdin);
    a=strlen(s1);
    b=strlen(s2);
    s1[strlen(s1)-1]='\0';
    s2[strlen(s2)-1]='\0';
    while(*p)
    {
        if(*p==*q)
        {
            temp++;
            p++;
            q++;
        }
        else{
            p++;
        }
    }
    if(temp==b-1)
    {
        printf("found\n");
    }
    else
    {
        printf("not found\n");
    }
    return 0;
}