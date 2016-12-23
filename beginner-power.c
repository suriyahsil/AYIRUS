#include <stdio.h>
void main()
{
    int val=0,pow=0,mul=1,i;
    scanf("%d%d",&val,&pow);
    for(i=1;i<=pow;i++)
        mul*=val;
       printf("%d",mul);
}
