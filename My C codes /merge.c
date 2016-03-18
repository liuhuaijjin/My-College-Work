#include<stdio.h>
int merge(int[20],int[20],int[50],int,int);
void main()
{
	int  a[20],b[20],i,j,ai,bi,c[50],k;
	printf("Enter the size of the First Array    : ");
	scanf("%d",&ai);
	printf("Enter the size of the Second Array    : ");
	scanf("%d",&bi);
	
	printf("Enter the Elements of the First Array\n");
	for(i=0;i<ai;i++)
	{
		scanf("%d",&a[i]);
	}
	printf("Enter the Elements of the Second Array\n");
	for(j=0;j<bi;j++)
	{
		scanf("%d",&b[j]);
	}
	//int i,j,k;
	i=0;j=0;k=0;
	
	printf(" Elements of the Sorted Array\n");
	while((i<=ai)&&(j<=bi))
	{
		if(a[i]<b[j])
		{
			c[k]=a[i];i++;
			printf("%d\n",c[k]);
		}
		else
		{
			c[k]=b[j];j++;
			printf("%d\n",c[k]);
		}
		k++;

	}
	if(i==ai)
	{
		while(j<=bi)
		{
			c[k]=b[j];
			k++;j++;
			printf("%d\n",c[k]);
		}
	}
	else
	{
		while(i<=ai)
		{
			c[k]=a[i];
			k++;i++;
			printf("%d\n",c[k]);
		}
	}
	
}

	
	






	
