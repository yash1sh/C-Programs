#include<stdio.h>
int main()
{
    int i,j,var='A';
    for(i=4;i>=1;i--){
    for(j=0;j<i;j++)
    printf("%c",(var+j));
    printf("\n");
    
    var='a'
    for(i=4;i>=1;i--){
    for(j=0;j<i;j++)
    printf("%c",(var+j));
    printf("\n");
    }
    return 0;
}
