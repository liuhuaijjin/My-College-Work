#include<stdio.h>
#define MAX 10
int d[MAX];
void selSort(int d[],int size)
{
    int i,j,min,t;
    for(i=0;i<size-1;i++)
    {
         min=d[i];
         for(j=i+1;j<size;j++)
         {
              if(d[j]<d[min])
                 min=j;
         }
         if(min!=j){
         	t=d[i];
         	d[i]=d[min];
         	d[min]=t;}
         
     }
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
     
}
     
