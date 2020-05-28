import java.util.*;


public class MaxNumInArray
{
public static void main(String[] args){

int[] array=new int[25];
Scanner n=new Scanner(System.in);
System.out.println("ENTER THE ARRAY ELEMENTS");
for(int i=0;i<25;i++)
{
array[i]=n.nextInt();
}
int MAX=array[0];
for(int i=0;i<25;i++)
{
if(array[i]>MAX)
{
MAX=array[i];
}
}
System.out.println("Maximum number in Array is"+":"+MAX);
}
}
		