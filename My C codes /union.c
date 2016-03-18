#include<stdio.h>
void main()
{
	union dibba
	{
		char key[5];
		int keyvalue;
	};
	
	union dibba meow;
	meow.key[0]='d';
	meow.key[1]='i';
	meow.key[2]='b';
	meow.key[3]='b';
	meow.key[4]='a';
	
	printf("%d\n",meow.keyvalue);
}
