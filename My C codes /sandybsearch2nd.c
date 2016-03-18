#include<stdio.h>

int bsearch(int *d,int a,int b,int n)
{
  int start=a,end=b,mid;
  while(start<=end)
  {
   mid=(start+end)/2;
   if(n==d[mid])
   return mid;
   else if(n<d[mid])
   end=mid-1;
   else
   start=mid+1;
  }
 return -1;
}

main()
{
 int d[100]={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14};
 int n,l;
 printf("Enter number you want to search\n");
 scanf("%d",&n);
 l=bsearch(d,0,10,n);
 if(l==-1)
 printf("Oopsy!! Not found!! ;)\n");
 else
 printf("Number found at index : %d\n",l);
}



