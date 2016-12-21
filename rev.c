#include <stdio.h>
void main()
{
    char l[10];
    int s;
    scanf("%s",l);
    s=strlen(l)-1;
    while(s>=0)
    {
        printf("%c",l[s]);
        s--;
    }
}