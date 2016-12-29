#include <stdio.h>
void main()
{
    int i,j,flag=0;
    char str[100];
    gets(str);
    for(i=0;i<strlen(str);i++)
    {
        for(j=0;j<strlen(str);j++)
        {
            if(i!=j)
                if(str[i]==str[j])
                flag=1;
        }
        if(flag==0)
            printf("%c",str[i]);
        flag=0;
    }
}
