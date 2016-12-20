#include<stdio.h>
void main()
{
 int n;
 scanf("%d",&n);
 if(n>0)
 printf("It is positive");
 else if(n<0)
 printf("It is negative");
 else
 printf("It is zero");
 getch();
}