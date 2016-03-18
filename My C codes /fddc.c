#include<stdio.h>
void main()
{
	int ar1[10][10], ar2[10][10],ar3[10][10],i,j,r,c;
	printf("Enter Column No.    : ");
	scanf("%d",&c);
	printf("Enter Row No.    : ");
	scanf("%d",&r);
	printf("Enter the Elements of the First array..\n");
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			scanf("%d",&ar1[i][j]);
		}
	}
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			printf("%d ",ar1[i][j]);
		}
		printf("\n");
	}
	printf("Enter the Elements of the Second array..\n");
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			scanf("%d",&ar2[i][j]);
		}
	}
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			printf("%d ",ar2[i][j]);
		}
		printf("\n");
	}
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			printf("%d ",ar2[i][j]+ar1[i][j]);
		}
		printf("\n");
	}
}
