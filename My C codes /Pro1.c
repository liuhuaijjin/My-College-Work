//to find the peak
#include<stdio.h>

int main()
{
int a[8] = {12,14,27,33,26,17,11,7};
int i, high = 7, low=0,mid,peak,x,j;

printf("enter a number:");
scanf("%d", &x);

while (low<=high)
{
mid=(high+low)/2;

if(a[mid+1]>a[mid] && a[mid]>a[mid-1])
low = mid-1;

else if (a[mid+1]<a[mid] && a[mid]<a[mid-1])
high = mid+1;

else if(a[mid+1]<a[mid] && a[mid]>a[mid-1])
{
peak=a[mid];
break;
}
}
printf("the peak is %d\n", peak);
}
