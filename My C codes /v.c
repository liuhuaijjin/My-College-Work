#define max 20
#include <stdio.h>
main()
{int i;
char a[max];
fgets(a,max,stdin);
for(i=0;a[i]!='\0';i++)
  {
   if(a[i]==' ')
    {
     i++;
     
     if(a[i]<=92&&a[i]>=67)
      {
       a[i]=a[i]+32;
      }
     while(a[i]!=' ')
          {i++;
           if(a[i]>97)
             a[i]=a[i]-32;
          }
    }
  }
puts(a);
}
