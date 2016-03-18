/*
OS lab5
author : Electron(surajnath), github.com/electron0zero
work : this file demostrates the usage of ( fork,exec,wait,getpid,getppid ) system calls and
		create a parent process call that display contents of a file via cat system utility and it's child process will display date
		useing date utility 
*/
#include<stdio.h>
#include<string.h>
#include <unistd.h> //for system calls
#include<sys/types.h>
#include<sys/wait.h>

int main(int argc,char* argv[])	{
	//handle command line arguments
	if(argc != 3){
	printf("\n\t== INVALID USAGE ==\n\n");
	printf("\tUsage : <program-name> <file-name> <command>\n\n");
	printf("\t<program-name> : name of this program\n");
	printf("\t<file-name> : name of file which you want to print useing cat system utility\n");
	printf("\t<command> : name of any program\n");
	return -1; //exit from program
	}
	//main 
	printf("\n\t== WELCOME IN PROCESS MANAGER ==\n\n");
	printf("argv[1] = %s\n",argv[1]);
	printf("argv[2] = %s\n",argv[2]);
	int PID;
	PID = fork();
	if(PID < 0){ //returns -1 on failure but as being safe we will consider every negative value as failure
	printf("\t== FAILURE : can not create child process == \n");		
	}
	else if(PID > 0) {	//process id of parent process is grater the 0
	wait(NULL); 
     /* wait(NULL);	
	this will hold the parent process untill child terminates untill child process terminate and then continue after termination of child process	
     */
	printf("parent process is created \n");
	printf("PID of process is %d\n",getpid());
	printf("\n");
	execlp("cat", "cat", argv[1], NULL);
	}
	else{ //fork returns 0 as the PID of child process
//because it's the first child process of this parent process	
	printf("child process is created \n");
	printf("PID of child process %d\n",getpid()); //prints the id of this prcess
	printf("PID of parent process %d\n",getppid());	//prints pid of parent process
	printf("\n");
	execvp(argv[2],&argv[2]);
	}

/*
use exec family functions to create a new process with new arguments as the part of this program so
with exec family functions we can load other programs as the part of this process.
this can be used to create a program that usage other program to do it's work.
for more exec family see "man exec" in linux programmer's mannual
	 
	#include <unistd.h>  //for exec() 
	int execlp(const char *file, const char *arg, ...);
	int execvp(const char *file, char *const argv[]);
*/
	


	return 0;
}
