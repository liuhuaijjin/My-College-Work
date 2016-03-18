#include<stdio.h>
int main()
{
char s1[100],s,r;
int i,l,ctr,length;
printf("input s and r");
scanf("%c%c",&s,&r);
printf("Enter string");
scanf("%s",s1);
for(i=0;i<100;i++)
{
while(s1[i]!='\0')
{
if(s1[i]==s)
 {
  s1[i]=r;
  ctr++;
 }
length++;
}
printf("length=%d\n",length);
printf("no of replacements=%d\n",ctr);
}
return 0;
}

