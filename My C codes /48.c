#include<stdio.h>
main()
{
int i;
char s[100];
printf("enter the string");
gets(s);
for(i=0;s[i]!='\0';i++)
{
if(s[i]>='A' && s[i]<='Z')
s[i]=s[i]+32;
}
for(i=0;s[i]!='\0';i++)
{
if(s[i]==' ')
s[i+1]=s[i+1]-32;
}
s[0]=s[0]-32;
puts(s);
}
