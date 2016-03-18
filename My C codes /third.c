#include<stdio.h>

int main()
{
	int a[6]={-2,-1,2,3,5,7};
	int i;
	for (i=0; i<=5; i++)
	{
		printf("%d\t",a[i]);
	}
	for (i=0; i<=5; i++)
	{
		if (a[i]==i)
		{
			break;
		}
	}
	printf("a[i] == i at pos %d\n\n",i);
}
