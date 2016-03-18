#include<stdio.h>

int main()
{
	
	int a[9]={25,30,35,50,5,10,13,18,20};
	int i,x,size,low,high,mid,flag;
	size=8;
	low=0;
	high=size;
	
	while(low<=high)       
	{
	   x=((low+high)/2);
	   if((a[x-1]<a[x])&&(a[x+1]<a[x]))
	   {
		mid=x;
		break;
	   }
	   /*else if ((a[x-1]<a[x]) && (a[x+1]>a[x]) && (a[x]>=a[0]))
	   {		
		low=(x+1);
	   }
	   else if ((a[x-1]<a[x]) && (a[x+1]>a[x]) && (a[x]<a[0]))
	   {
		high=(x-1);
	   }*/
	}

	for(i=0;i<=size;i++)
	{
		printf("%d\t",a[i]);
	}
	printf("\n\nmid = %d	at position %d\n\n",a[mid],x);
}
