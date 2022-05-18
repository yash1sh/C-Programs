#include<stdlib.h>
#include<stdio.h>
char rev(char *q)
{ 
    int z = *q ==' '? 0: *q=='\0'?0: rev(q+1)+1;
    if(z)
    {
        putchar(*q);
    }
    return z;
}
int main()
{
    int a;
    char *p=(char *)malloc(100*sizeof(char));
    printf("enter the string\n");
    gets(p);
    while(*p)
    {
        a = rev(p);
        p = p+a;
        if(*p=' ')
        {
            putchar(' ');
            p++;
        }
    }
}
