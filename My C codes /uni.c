#include<stdio.h>

int main()
{
	int a[8]={10,14,27,35,26,17,12,7};

	int i,x,size,low,high,mid,flag;
	size=7;
	low=0;
	mid=0;
	high=size;
	while(low<=high)       
	{
	   x=((low+high)/2);
	   if((a[x-1]<a[x]) && (a[x+1]>a[x]))
	   {		
		low=x;
	   }
	   else if ((a[x-1]>a[x])&&(a[x+1]<a[x]))
	   {
		high=x;
	   }
	   else if ((a[x-1]<a[x])&&(a[x+1]<a[x]))
	   {
		mid=x;
		break;
	   }
	}

	for(i=0;i<=size;i++)
	{
		printf("%d\t",a[i]);
	}
	printf("\n\nmid = %d	at position %d\n\n",a[mid],x);

	int find;
	
	printf("Enter the number to be found : ");
	scanf("%d", &find);
	
	flag=0;
	low=0;
	high=mid-1;
	while(low<=high)       
	{
	   x=((low+high)/2);
	   if (a[x]==find)
	   {		
		flag=1;
		break;
	   }
	   else if (find<a[x])
	   {
		high=(x-1);
	   }
	   else if (find>a[x])
	   {
		low=(x+1);
	   }
	}

	if (flag==0)
	{
		low=mid+1;
		high=size;
		while(low<=high)       
		{
	   		x=((low+high)/2);
	   		if(a[x]==find)
	  		 {		
				flag=1;
				break;
	  		 }
	  		 else if (find>a[x])
	  		 {
				high=(x-1);
	   		}
	   		else if (find<a[x])
	   		{
				low=(x+1);
	  		 }
		}
	}

	if(flag==1)
	{
		printf("\n\nyour number %d has been found at position %d\n\n",find,x);
	}
	else if(flag==0)
	{
		printf("\n\nOops! Your number %d was not found.\n\n",find);
	}


}










	
