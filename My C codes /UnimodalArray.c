#include <stdio.h>
#define length 8

int uniArray[length] = {12, 14, 27, 33, 26, 17, 12, 7};

int main (void)
{
	int mid = length/2;
	int val, index;
	printf("Enter the value to be searched: ");
	scanf("%d", &val);
	if(val == uniArray[mid])
	{
		printf("value %d found at index: %d\n", val, mid);
	}
	else if (val != uniArray[mid])
	{
		index = peakSearch(mid);
		index = binarySearch(0, index, val, 1);
		if(index == -1)
			index = binarySearch(index, length, val, -1);
		printf("value %d found at index: %d\n", val, index); 
	}
	return 0;
}

int binarySearch(int start, int end, int val, int prop)
{
		int mid = end-start/2;
	if (mid == 0)
		return -1;
	if(val == uniArray[mid])
		return mid;
	else if (prop == 1)
	{
		if(val<uniArray[mid])
			return binarySearch(start, mid-1, val, prop);
		else if(val>uniArray[mid])
			return binarySearch(mid+1, end, val, prop);
	}
	else if (prop == -1)
	{
		if(val<uniArray[mid])
			return binarySearch(mid+1, end, val, prop);
		else if (val>uniArray[mid])
			return binarySearch(start, mid-1, val, prop);
	}
		
}

int peakSearch(int mid)
{
	int i;
	int temp = uniArray[mid];
	if(temp > uniArray[mid+1])
	{	
		for (i=mid; i>=0; i--)
		{
			if (uniArray[i]>temp)
				temp = uniArray[i];
			else if (uniArray[i]<temp)
				break;
		}
		i++;
		return i;
	}
	else if (temp < uniArray[mid+1])
	{
		for (i=mid; i<length; i++)
		{
			if (uniArray[i]>temp)
				temp = uniArray[i];
			else if (uniArray[i]<temp)
				break;
		}
		i--;
		return i;
	}
}
