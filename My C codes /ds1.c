#include<stdio.h>
#define MAX 100
int lsearch(int d[],int start, int end, int n)
{
     int i;
     for(i=start;i<end;i++)
     {
         if(d[i]==n)
         {
            return i;
         }
     }
        return -1;
}
main()
{
     int i,d[MAX],n,k;
     printf("Enter elements into the array: ");
     for(i=0;i<11;i++)
     {
         scanf("%d",&d[i]);
     }
     printf("Enter the number to search: ");
     scanf("%d",&n);
     k=lsearch(d,0,10,n);
     printf("Item found at index: %d",k);
}

