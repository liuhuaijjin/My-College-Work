#include<stdio.h>
void main()
{
	int ar[50],i,s;
	printf("Enter the size of the array     : ");
	scanf("%d",&s);
	
	for(i=0;i<s;i++)
	{
		printf("Enter No.  : ");
		scanf("%d",&ar[i]);
	}
	
	mergesort(ar[50],s);
	
	for(i=0;i<s;i++)
	{
		printf("%d ",ar[i]);
	}
	
}
mergesort(int ar[50],int s)
{
	int fh[25],sh[25],fhsize,shsize,i;
	if(s>1)
	{
		for(i=0;i<(s/2);i++)
		{
			fh[i]=ar[i];
		}
		fhsize=i;
		for(i=(s/2);i<s;i++)
		{
			fh[i]=ar[i];
		}
		shsize=(s-i);
		mergesort(fh[25],fhsize);
		mergesort(sh[25],shsize);
		merge(ar[50],fh[25],fhsize,sh[25],shsize);
	}
}
merge(int ar[50],int fh[25],int fhsize,int sh[25],int shsize)
{	
	int i,j,k;
	i=0;k=0;j=0;
	while((j<fhsize)&&(i<shsize))
	{
		if(fh[j]<sh[i])
		{
			ar[k]=fh[j];
			k++;
			j++;
		}
		else
		{
			ar[k]=sh[i];
			k++;
			i++;
		}
	}
	while(j<fhsize)
	{
		ar[k++]=fh[j++];
	}
	while(i<shsize)
	{
		ar[k++]=sh[i++];
	}
	
}	
	
	
	
	
	
	
	
	
	
	
	
		














