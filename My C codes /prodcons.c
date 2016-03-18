#include<stdio.h>
void producer(int buffer[25],int in,int out,int bs);
void consumer(int buffer[25],int in,int out,int bs);
main()
{
	int out=0,in=0,buffer[25],bs;
	printf("Enter the buffer size");
	scanf("%d",&bs);
	bs=bs+1;
	producer(buffer,in,out,bs);
}
void producer(int buffer[25],int in,int out,int bs)
	{
	int next_pro=0;
	printf("Enter the elements produced by the producer");
		while(1)
			{
				while((in+1)%bs==out)
				consumer(buffer,in,out,bs);
				next_pro=0;
				scanf("%d",&next_pro);
				buffer[in]=next_pro;
				in=(in+1)%bs;
			}
	}
void consumer(int buffer[25],int in,int out,int bs)
	{
	int next_con=0;
	char s;
	printf("enter the element of consumed by the consumer");
	while(1)
		{
		while(in==out)
			{
			printf("Do you want to continue (Y/N) :/n");
			scanf("%s",&s);
			if(s=='y')
				producer(buffer,in,out,bs);
			else
				{
				printf("End /n");
				return (0);
				}
			}
		printf("%d \n",buffer[out]);
		out=(out+1)%bs;
		}
	}
