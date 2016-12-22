#include <stdio.h>
void main()
{
    char letter;
    scanf("%c",&letter);
    if((letter>='a'&&letter<='z')||(letter>='A'&&letter<='Z'))
        printf("%c is an alphabet",letter);
    else if(isdigit(letter))
        printf("%c is a number",letter);
    else
        printf("%c is special charcter",letter);
}
