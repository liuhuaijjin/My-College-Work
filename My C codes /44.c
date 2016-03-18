#include<stdio.h>
main(){
char a[100]; int i=0,c=0;
printf("Enter string : \n");
fgets(a,100,stdin);
for(i=0;a[i]!='\n';i++)
{
if(a[i]==' '&&a[i+1]!=' '&&a[i+1]!='.'&&a[i+1]!=','&&a[i+1]!=';')
c++;
if(a[i]=='.'&&a[i+1]!=' '&&a[i+1]!='.'&&a[i+1]!=','&&a[i+1]!=';')
c++;
if(a[i]==','&&a[i+1]!=' '&&a[i+1]!='.'&&a[i+1]!=','&&a[i+1]!=';')
c++;
if(a[i]==';'&&a[i+1]!=' '&&a[i+1]!='.'&&a[i+1]!=','&&a[i+1]!=';')
c++;
}
printf("The number of words are %d \n",c);
}
