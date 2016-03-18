#include<stdio.h>

main()
{
 int arr[9]={6,7,5,3,8,9,1,2,4};
 int i,j,tmp,n=9;
 for(i=1;i<n;i++)
 {
  j=i;
  tmp=arr[i];
  while(j>0)
  {
   if(arr[j-1]<tmp)
   break;
   arr[j]=arr[j-1];
   j=j-1;
  }
  arr[j]=tmp;
 }
 printf("Sorted array is : ");
 for(i=0;i<n;i++)
 {
  printf("%d ",arr[i]);
 }
}


