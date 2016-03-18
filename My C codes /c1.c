#include<stdio.h>
#include<math.h>
struct{
int x,y;
}p[50];

main()
{
     int i,j=1,n,x=0;;int px[100],py[100];float d,d1;int px1,py1,px2,py2;int c=0;float dist[500];
     float small=dist[0];
     printf("Enter the value of n: ");
     scanf("%d",&n);
     printf("Enter n points: ");
     for(i=0;i<n;i++)
     {
           scanf("%d",&p[i]);        
     }
     for(i=0;i<n;i++)  
     {
           d=sqrt(pow((py[i+1]-py[i]),2)+pow((px[i+1]-px[i]),2));
	   dist[x]=d;
           x++;
           /*if(d<small)
           { 
		small=d;
                px1=px[i];px2=px[i+1];
                py1=py[i];py2=px[i+1];
           }*/
     }
     for(;j<n;j++)  
     {
           d=sqrt(pow((py[j+1]-py[c]),2)+pow((px[j+1]-px[c]),2));
           dist[x]=d;
           x++;
           /*if(d<small)
           { 
		small=d;
                px1=px[i];px2=px[i+1];
                py1=py[i];px2=px[i+1];
           }*/
           if(j==n-1)
           {
              c++;
              continue;
           }
     }
     for(i=0;i<x;i++)
        {
             if(dist[i]<small)
                   small=dist[i];
        }
     
     //printf("Closest pair: (%d,%d) and (%d,%d)",px1,py1,px2,py2);
     printf("Distance: %f",small);
}
