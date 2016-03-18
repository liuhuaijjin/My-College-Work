#include<stdio.h>
/**main()
{
int a[10],b;
for(b=0;b<10;b++)
{
scanf("enter 10 numbers %d\n",&a[b]);
}
int max=a[0];
int min=a[0];
for(b=0;b<10;b++)
{
if(max<a[b])
max=a[b];

if(min>a[b])
min=a[b];

printf("max= %d",max);
printf("min= %d", min);
}
}
**/
main()
{
int a[10],b;
printf("enter 10 integers");
for(b=0;b<10;b++)
{
scanf("enter 10 numbers %d\n",&a[b]);
}
int *p,max=0,min=0;

while(p!=0)
{
if(max < *p)
max=*p;

if(min> *p)
min=*p;

p++;
}
printf("greatest number: %d",max);
printf("smallest number: %d",min);
}
