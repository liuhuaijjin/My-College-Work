#include <stdio.h>
#define MAX 8

int Array[MAX] = {4, 6, 15, 17, 24, 38, 44, 50};

int main (void)
{
	int val, i;
	int *p, *q;
	p = &Array[0];
	q = &Array[MAX-1];
	printf("enter the number: ");
	scanf("%d", &val);
	
	while (1)
	{
		//printf (" %d, %d |", *p, *q); 
		if (*p == *q)
		{
			printf("no solution!!! \n");
			break;
		}
		else if(*p+*q == val)
		{
			printf("the segment no. are: (%d,%d)\n", *p, *q);
			break;
		}
		else if(*p+*q >val)
			q--;
		else if (*p+*q < val)
			p++;
	}
	return 0;
}

