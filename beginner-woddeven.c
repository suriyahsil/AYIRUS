#include <stdio.h>
void main()
{
    int num;
    scanf("%d",&num);
    if(((num>>1)<<1)==num)
        printf("even no");
    else
        printf("odd no");
}
