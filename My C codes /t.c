#include<stdio.h>
int main(void)
{
char s[100],i;
printf("Enter your string");
gets(s);
for(i=0;s[i]!='/0';i++)
{
if(isupper(s[i])
i++;
else(printf("%c",toupper(s[i])));
}
return 0;
}
