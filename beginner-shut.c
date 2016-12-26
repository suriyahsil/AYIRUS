#include <stdio.h>
void main()
{
    char c;
    printf("Y/N");
    scanf("%c",&c);
    if(c=='Y'||c=='y')
    system("C:\\WINDOWS\\SYSTEM32\\SHUTDOWN -S");
    return 0;
}
