#include <stdio.h>
#include <string.h>

void main()
{
    char str[100];
    printf("enter the strin\n");
    scanf("%[^\n]",str);
    printf("the string is %s",str);
    
}
