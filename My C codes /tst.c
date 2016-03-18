#include<stdio.h>

struct film{
int id;
char name[20];
int year;
float budget;
};

main()
{
int n,i,j;
char ch='n';
struct film flm[3];
{101,"one",2001,19500;
102,"two",2002,16500;
102,"three",2003,17500;}
for(j=0;j<2;j++)
printf("Enter id of film you want to search : ");
scanf("%d",&n);
for(i=0;i<3;i++)
{ if(flm[i].id==n)
  printf("\nName of the film : %s\nYear of Production : %d\nBudget : %f\n",flm[i].name,flm[i].year,flm[i].budget);
  break;
}
if(i==3)
printf("Not Found\n");
printf("Do you want to search again??(yes=0)");
scanf("%d",j);
}while(ch=='y'||ch=='Y');
}
 
