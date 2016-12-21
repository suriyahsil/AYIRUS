#include <stdio.h>
void main()
{
  int i,n;
  unsigned long fact=1;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
   fact*=i;
   printf("fact(%d)=%lu",n,fact);
}
