#include<stdio.h>

void insert(char [],char [],int);
main()
{
 char str[20],n[20];
 int i;
 printf("Enter string 1: ");
 gets(str);
 printf("Enter string 2: ");
 gets(n);
 printf("Enter pos of catenation: ");
 scanf("%d",&i);
 insert(str,n,i);
 puts(str);
}

void insert(char str[],char n[],int i)
{
 char *p,*q,*r,*s,*t;
 int x=0,j,gap;
 p=str;
 q=str;
 r=n;
 
 while(*r!='\0')
 {
  r++;
  x++;
 }
 
 r=n;
 
 while(*q!='\0')
  q++;

 s=q;
  
 i--;
 while(i>0)
 {
  if(*p==' ')
   i--;
  p++;
 }
 
 t=p; 	
 
 gap=q-p;
 *s=' ';
 s++; 
 for(j=0;j<gap+1;j++)
 {
  *s=*p;
  s++;
  p++;  
 }
 
 for(j=0;j<x;j++)
 {
  *t=*r;
  t++;
  r++;
 }
 *s='\0';
  
}
 
