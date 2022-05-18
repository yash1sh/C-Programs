/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>

int main()
{
    int num1,i,size,a[100],choice,pos;
    printf("enter the size\n");
    scanf("%d",&size);
    printf("enter the array\n");
    
    for(i=0;i<size;i++)
    scanf("%d",&a[i]);
    
    printf("The array elements are\n");

    for(i=0;i<size;i++)
    printf("%d\t",a[i]);
    printf("\n");
    while(2)
    {
    printf("Enter your choice in number\n");
    printf("1)Insertion in position\n 2) insertion in beginning\n 3) insertion in the end");
    printf("enter the number\n");
    scanf("%d",&choice);
    
    switch(choice)
    {
        case 1:size++;
        printf("enter the number you want to insert\n");
        scanf("%d",&num1);
        printf("Enter the position\n");
        scanf("%d",&pos);
        
        if(pos<=0 || pos>size)
        {
        printf("invalid input should be greater than 0 and less than %d",size);
        break;
        }

        for(i=size-2;i>=pos-1;i--)
            a[i+1]=a[i];
            
        a[pos-1]=num1;
        printf("elements are\n");
        for(i=0;i<size;i++)
        printf("%d\t",a[i]);
        break;
        
        case 2:size++;
        printf("enter the number you want\n");
        scanf("%d",&num1);
        for(i=size-2;i>=0;i--)
            a[i+1]=a[i];
        a[0]=num1;
        printf("elements are\n");
        for(i=0;i<size;i++)
        printf("%d\t",a[i]);
        break;
        
        case 3:size++;
        printf("enter the number you want to enter at the last\n");
        scanf("%d",&num1);
        a[size-1]=num1;
        printf("elements are\n");
        for(i=0;i<size;i++)
        printf("%d\t",a[i]);
        break;
    }
    }
    
    
    
    
    
    return 0;
}
