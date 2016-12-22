#include <stdio.h>
void main()
{
    int s,l,i,val=0;
    scanf("%d%d",&s,&l);
    if(s==1)
    {
     printf("1 is neither prime nor composite");
    }
    else
    {
     while(s<l)
     {
     for(i=2;i<=s/2;++i)
     {
      if(s%i==0)
      val=1;
     }
     if(val==0)
     printf("%d\t",s);
     else
     val=0;
     ++s;
     }
    }
}