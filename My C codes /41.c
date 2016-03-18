#include<stdio.h>
main(){
int j; char a[100];
printf("enter the string :\n");
fgets(a,100,stdin);
for(j=0;a[j]!='\n';j++)
{ 
if(a[j]>='a'&&a[j]<='z')
a[j]+=('A'-'a');
}
puts(a);
}

