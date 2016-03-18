#include<stdio.h>
#define MAX 10
int d[MAX];
void selSort(int d[],int size)
{
    int i,j,min,t;
    for(i=0;i<size;i++)
    {
         min=d[i];
         for(j=i+1;j<size-1;j++)
         {
              if(d[j]<d[min])
              {
                   min=j;
                   t=d[min];
                   d[min]=d[j];
                   d[j]=t;
              }
          }
     }
}
int printArray(int d[], int size)
{
    int i;
    for(i=0;i<size;i++)
        printf("%d ",d[i]);
}
main()
{
     int i;
     printf("Enter elements into the array :");
     for(i=0;i<MAX;i++)
     {
          scanf("%d",&d[i]);
     }
     selSort(d,10);
     printArray(d,10);
}
     
