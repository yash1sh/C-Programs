#include<stdio.h>
int main()
{
    char *ptr="hello";
    printf("%c\n",*&*ptr);
    return 0;
}