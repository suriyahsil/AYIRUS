#include <stdio.h>
void main()
{
    int i,j,len,flag=0;
    char str[100];
    gets(str);
    len=strlen(str);
    for(i=0;i<len;i++)
    {
        for(j=i+1;j<len;j++)
        {
            if(str[i]==str[j])
                flag=1;
        }

    }
    if(flag==1)
        printf("%s is not an isogram",str);
    else
        printf("%s is an isogram",str);
}
