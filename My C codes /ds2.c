#include<stdio.h>
#define MAX 15
int bsearch(int d[],int start, int end, int n)
{
    int max;
    while(start<=end)
    {
        max=(start+end)/2;
        if(n==d[max])
        {
              return max;
        }
        else if(n>d[max])
               start=max+1;
        else
               end=max-1;
    }
    return -1;
}
main()
{
   
     int i,d[MAX],n,k;
     printf("Enter elements into the array: ");
     for(i=0;i<10;i++)
     {
         scanf("%d",&d[i]);
     }
     printf("Enter the number to search: ");
     scanf("%d",&n);
     k=bsearch(d,0,10,n);
     printf("Item found at index: %d",k);
}
