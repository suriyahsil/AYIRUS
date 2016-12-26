#include <stdio.h>
void main()
{
    int s,l,*k,*t,join;
    scanf("%d%d",&s,&l);
    k=&s;
    t=&l;
    join=*k+*t;
    printf("%d",join);
    return 0;
}
