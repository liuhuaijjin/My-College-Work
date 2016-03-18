#include <stdio.h>
main()
{
int i=0,j=0;
char a[10],b[10],c[30];
fgets(a,10,stdin);
fgets(b,10,stdin);

while(a[i]!='\0')
{
c[i]=a[i];
i++;
}
while(b[j]!='\0')
{
c[i]=b[j];
i++;
j++;
}
puts(c);
}
