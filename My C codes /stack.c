#include<stdio.h>
#define MAX 10
int a[MAX],top=-1;
main()
{
int n,n3,i=0;
while(n!=3){
printf("Enter 1 for push or 2 for pop or 3 for exit or 4 for display:\n");
scanf("%d",&n);
}
if(n==1){
printf("Enter item to be pushed:\n");
scanf("%d",&n3);
push(a,n3);
}
if(n==4){
printf("Stack::\n");
printstack(a);
}
i++;
}
push(int a[MAX],int n1)
{  
if(top==MAX-1)
{
printf("Overflow");
}
else
{
a[++top]=n1;
}
}
printstack(int a[])
{
int i;
if(top==-1)
printf("\n stack is empty");
else
{
for(i=top;i>=0;i--)
printf("\n%d",a[i]);
}
}
