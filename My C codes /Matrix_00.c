#include<stdio.h>
void main()
{
	int ar[10][10],i,j,r,c;
	printf("Enter Column No.    : ");
	scanf("%d",&c);
	printf("Enter Row No.    : ");
	scanf("%d",&r);
	printf("Enter the Elements of the array..\n");
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			scanf("%d",&ar[i][j]);
		}
	}
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			printf("%d ",ar[i][j]);
		}
		printf("\n");
	}
	printf("Transpose of Matrix\n");
	for(i=0;i<c;i++)
	{
		for(j=0;j<r;j++)
		{
			printf("%d ",ar[j][i]);
		}
		printf("\n");
	}
	
}
