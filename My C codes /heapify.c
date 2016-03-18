#include <stdio.h>
int heap [11] = {8, 14, 4, 12, 18, 6, 10, 16, 20, 2, 22};
int heapSize = 11;
int x;
void Heapify (int i);
int main ()
{
	
	for (x=0;x<11;x++)
		printf("%d /t",heap[x]);
	printf("/n");
	
	Heapify(4);
	
	for (x=0;x<11;x++)
		printf("%d /t",heap[x]);
	printf("/n");
	
	
			
}

void Heapify (int i)
{
	int j = (2i)+1;
	int k = (2i)+2;
	while (i<=heapSize)
	{	
	int t1=heap[i];
	int t2=heap[j];
	int t3=heap[k];
	
	if ((t2>t1)&&(t2>t3))
	{
		heap[i]=t2;
		heap[j]=t1;
		Heapify (j);
	}
		
	else if ((t3>t1)&&(t3>t1))
	{
		heap[i]=t3;
		heap[k]=t1;
		Heapify (k);
	}
	}
}
	


