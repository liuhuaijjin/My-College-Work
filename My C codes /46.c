#include<stdio.h>
main(){
int i,c=0; char a[100];
printf("Enter the string : \n");
fgets(a,100,stdin);
if(a[0]>='a'&&a[0]<='z')
a[0]=toupper(a[0]);
for(i=1;a[i]!='\n';i++)
{
a[i]=tolower(a[i]); 
if((a[i]>='a'&&a[i]<='z')||(a[i]>='A'&&a[i]<='Z'))
{


  if(!((a[i-1]>='a'&&a[i-1]<='z')||(a[i-1]>='A'&&a[i-1]<='Z')))
   {
      
	a[i]=toupper(a[i]);
    }
}

}
puts(a);
}


