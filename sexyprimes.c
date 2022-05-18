#include<stdio.h>
int sexyprimes(int n)
{
    int i;
    if(n==0 || n==1)
    return 0;
    if (n<=3)
    return 0;
    if(n%2==0 || n%3==0)
    return 0;
    for(i=5;i*i<n;i+=6)
    {
       if(n%i==0 || n%(i+2)==0)
       return 0;
    }
   // if()
    return 1;
}
int main()
{
 int m,n,i;
 printf("enter the range m and n\n");
 scanf("%d %d",&m,&n);
 for(i=m;i<=n;i+=6)
 {
     if(sexyprimes(i) && sexyprimes(i+6))
     printf("(%d,%d)\n",i,i+6);
 }
 return 0;
}