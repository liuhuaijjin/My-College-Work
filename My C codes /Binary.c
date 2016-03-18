#include<stdio.h>
int bsearch(int[],int,int,int);
void main()
{
	int st,no,a[20],i,beg,end,pos;
	
	printf("Enter the size of the Array        : ");
	scanf("%d",&st);
	printf("Enter the Elements of the Array  \n");
	for(i=0;i<st;i++)
	scanf("%d",&a[i]);
	printf("Enter the No. you want to Search   : ");
	scanf("%d",&no);
	beg=0;end=st-1;
	pos=bsearch(a,no,beg,end);
	if(pos==-1)
	{
		printf("The Elements are not found !!!!!!!!!\n");
	}
	else
	{
		printf("The Elements are found at the place: %d\n",pos+1);
	}

	
}
int bsearch(int a[20],int num,int beg,int end)
{
	int mid,pos;
	if(beg>end)
	{
		return -1;
	}
	else
	{
		mid=(beg+end)/2;
		if(a[mid]==num)
		{
			return mid;
		}
		else if(num>a[mid])
		bsearch(a,num,mid+1,end);
		else
		bsearch(a,num,beg,mid-1);
	}
	
}
