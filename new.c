#include <stdio.h>
int main()
{
char str1[]="Keep India Beautiful… emigrate!";
char str2[40];
strcpy(str2,str1);
printf("%s",str2);
}
strcpy(char *t,char *s)
{
while(*s)
{
*t=*s;
t++;
s++;
}
*t='\0';
}