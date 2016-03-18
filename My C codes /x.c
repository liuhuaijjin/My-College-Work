#define max 10
#include <stdio.h>
void largest(int *);
main()
{
int a[max],*p,i;
printf("enter your numbers");
for(i=0;i<max;i++)
scanf("%d",a[i]);
largest(&a);
}

void largest(int *p)
{
int c=0,m;
m=*p;
for(;c<max;p++)
{
if(*p>m)
m=*p;
c++;
}
printf("%d",&m);
}
