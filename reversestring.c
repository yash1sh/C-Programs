#include<stdio.h>
char *rev(char *p)
{
static char a[10];
static int i=0;
if(*p)
{
    rev(p+1);
    a[i+1]=*p;
}
return a;
}
int main()
{
    int q;
    char s1;
    scanf("%d",s1);
    q=rev(s1);
    printf("%d",q);
}