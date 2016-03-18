#include<stdio.h>
main()
{
char s[50],*p;
printf("enter the string");
scanf("%s",s);
p=s;
int i,n;
while(*p!='\0')
{
puts(p);
p++;
}
}
