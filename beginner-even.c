#include <stdio.h>
void main()
{
    int start,last,i;
    scanf("%d%d",&start,&last);
        for(i=start+1;i<last;i++)
        {
            if(i%2==0)
            printf("%d\t",i);
        }
}
