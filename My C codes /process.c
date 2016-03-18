/*
OS lab4 
author : Electron(surajnath), github.com/electron0zero
work : this file demostrates the usage of ( fork,exec,wait,getpid,getppid ) system calls
*/
#include<stdio.h>
#include<string.h>
#include <unistd.h> //for system calls
#include<sys/types.h>
#include<sys/wait.h>

int main(int argc,char* argv[] )	{
	printf("WELCOME IN PROCESS MANAGER\n");
	int PID;
	PID = fork();
	if(PID < 0){ //returns -1 on failure but as being safe we will consider every negative value as failure
	printf("FAILURE : can not create child process \n");		
	}
	else if(PID > 0) {	//process id of parent process is grater the 0
	wait(NULL); 
     /* wait(NULL);	
	this will hold the parent process untill child terminates untill child process terminate and then continue after termination of child process	
     */
	printf("parent process is created \n");
	printf("PID of process is %d\n",getpid());
	}
	else{ //fork returns 0 as the PID of child process
//because it's the first child process of this parent process	
	printf("child process is created \n");
	printf("PID of child process %d\n",getpid()); //prints the id of this prcess
	printf("PID of parent process %d\n",getppid());	//prints pid of parent process
	}

/*
use exec family functions to create a new process with new arguments as the part of this program so
with exec family functions we can load other programs as the part of this process.
this can be used to create a program that usage other program to do it's work.
for more exec family see "man exec" in linux programmer's mannual
*/

	return 0;
}
