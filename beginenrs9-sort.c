#include <stdio.h>
void main()
{
    char s[50];
    int i,len;
    gets(s);
    len=strlen(s);
    for(i=0;i<len;i++)
    {
     if((i%2)==0)
     printf("%c",s[i]);
    }
    printf(" ");
    for(i=0;i<len;i++)
    {
     if(i%2!=0)
     printf("%c",s[i]);
    }
}