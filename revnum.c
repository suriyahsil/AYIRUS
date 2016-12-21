#include <stdio.h>
void main()
{
    int i,ref=0,sum;
    scanf("%d",&sum);
    while(sum>0)
    {
        i=sum%10;
        printf("%d",i);
        sum=sum/10;
    }
}