#include <stdio.h>
void main()
{
    char ls;
    scanf("%c",&ls);
    if(ls=='a'||ls=='e'||ls=='i'||ls=='o'||ls=='u'||ls=='A'||ls=='E'||ls=='I'||ls=='O'||ls=='U')
        printf("%c is a vowel",ls);
    else
        printf("%c is a consonant",ls);
}
