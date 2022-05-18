
#include<stdio.h>
int main()
{
    int x = 10, y = 20;
    int *ptr = &x;
    int &ref = y;

    *ptr++;
     ref++;    

    printf("x=%d,y=%d",x,y);
    return 0; 
}