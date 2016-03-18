#include<stdio.h>
#include<sys/types.h>
#include<sys/wait.h>
#include<unistd.h>
int main(int argc, char *argv[])
{
    int id;
    id=fork();
    if(id==-1)
    {
        printf("there has been an error in the creation of the process...");

    }
    else if(id>0)//id>0 is returned to the parent process.
    {
        printf("Creation of process has been successful\n");
        printf("The pid of the current process, that is the c program that is being executed is: %d \n",getpid());
        printf("parent process will display the file...\n");
        execlp("cat","cat",argv[0],NULL);
        wait(NULL);
    }
    else if(id==0)//id==0 is returned to the child process, when id is 0 then the child process is being
    //referred. Understand that the c program is itself a process and
    {
        printf("pid of the child process is: %d \n",getpid());
        printf("pid of the parent process that is the c program is :%d \n", getppid());
        execvp(argv[1],&argv[1]);
    }
    return 0;
}


