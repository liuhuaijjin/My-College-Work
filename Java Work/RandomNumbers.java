import java.io.*;
import java.util.Random;
import java.util.*;
 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RandomNumbers
{
static int zero=0, one=0, two=0, three=0, four=0, five=0, six=0, seven=0, eight=0, nine=0, c = 0;	
public static void main (String[] args) throws IOException
{

int low = 1000;
int high = 9999;
int result, j=0;
String line;
int[] resultArray = new int[1000];


File randomNumbersFile = new File("randomNumbers.txt");
randomNumbersFile.createNewFile();
FileWriter writer = new FileWriter(randomNumbersFile);
File cleanFile = new File("clean.txt");
cleanFile.createNewFile();
FileWriter writer1 = new FileWriter(cleanFile);
FileReader reader = new FileReader(randomNumbersFile);
BufferedReader bufferedReader = new BufferedReader(reader);
Random r = new Random();


for(int i=0; i < 1000; i++)
{
result = r.nextInt(high-low) + low;
writer.write(result + "\n");
writer.flush();
}


while ((line = bufferedReader.readLine()) != null)
{
resultArray[j] = Integer.parseInt(line);
noOfOccurances(line);
j++; 	
}

System.out.println("\tZero=" + zero +
 "\tOne=" + one + 
 "\tTwo=" + two + 
 "\tThree=" + three + 
 "\tFour=" + four +
 "\tFive=" + five +
 "\tSix=" + six + 
 "\tSeven=" + seven +
 "\tEight=" + eight + 
 "\tNine=" + nine);

System.out.print("\nTotal number of characters = ");
System.out.println((zero+one+two+three+four+five+six+seven+eight+nine));

Arrays.sort(resultArray);
int rem;

ArrayList<String> Clean=new ArrayList<String>();
Collections.addAll(Clean,resultArray);
for(int p=0;p<(999-rem);p++)
{String res=Clean.get(p);
writer1.write(res + "\n");
writer1.flush();

for(int s=p;Clean.get(p)==Clean.get(s+1);rem++)
{Clean.Remove(s+1);

}
}


for (int l=0; l < 999 ; l++)
{
	int count = 1, temp = 0;
	if(resultArray[l] == resultArray[l+1])
	{
	temp = resultArray[l];
	count++;
		for(int m=2; m< 10; m++)
		{
if(l<950)
			if(resultArray[l] == resultArray[l+m])
			{
			count++;
			}
			else
			{
			break;
			}
		}
	System.out.println(temp + " comes " + count + " times" );	
	}
	
}
System.out.println ("Done");
writer.flush();
writer.close();
reader.close();
}
public static void noOfOccurances (String x)
{
int charArray[] = new int[4];
charArray[0] = x.charAt(0) - '0';
charArray[1] = x.charAt(1) - '0';
charArray[2] = x.charAt(2) - '0';
charArray[3] = x.charAt(3) - '0';
for(int k=0; k<4; k++)
{
switch (charArray[k])
{
case 0:
zero++;
break;
case 1:
one++;
break;
case 2:
two++;
break;
case 3:
three++;
break;
case 4:
four++;
break;
case 5:
five++;
break;
case 6:
six++;
break;
case 7:
seven++;
break;
case 8:
eight++;
break;
case 9:
nine++;
break;
default:
c++;
break;
}
}

}
}
