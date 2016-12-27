#include <stdio.h>
void main()
{
    int min,max,i,n,val[100],sum;
    printf("enter number limit:");
    scanf("%d",&n);
    for(i=0;i<n;i++)
        scanf("%d",&val[i]);
    max=val[0];
    min=val[0];
    i=n;
    for(i=0;i<n;i++)
    {
        if(max>val[i])
            max=val[i];
        if(min<val[i])
            min=val[i];
    }
    sum=max+min;
    printf("%d",sum);
}
