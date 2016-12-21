#include <stdio.h>
void main()
{
    int i=0,j,a[10],n;
    char rom[100];
    scanf("%s",&rom);
    do
    {
    switch(rom[i])
    {
        case 'I': a[i]=1;
                  break;
        case 'V': a[i]=5;
                  break;
        case 'X': a[i]=10;
                  break;
        case 'L': a[i]=50;
                  break;
        case 'C': a[i]=100;
                  break;
        case '/0':a[i]=0;
                  break;
        default  :printf("invalid roman letter");
     }
     i++;
    }while(i!=strlen(rom));
    n=a[i-1];
    for(j=i-1;j>0;j--)
    {
        if(a[i-1]>a[j-1])
         n-=a[j-1];
        else
         n+=a[j-1];
    }
    printf("%d",n);
}