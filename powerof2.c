/*by using loops*/


#include <stdio.h>

void main()
{
int n,r=1;
printf("enter the number\n");
scanf("%d",&n);
for(int i=1;i<n;i++)
{
    if(r<n)
    {
        r=r*2;
    }
    else if(r>n)
    {
        break;
    }
    
}
if(r=n)
{
    printf("power of 2");
}
else
{
    printf("no");
}
}