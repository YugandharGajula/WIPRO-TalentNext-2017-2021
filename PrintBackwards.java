import java.util.*;
import java.io.*;
public class PrintBackwards
{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
	int i=100;
        while(i>=0)
        {
            System.out.print(i);
            System.out.print(" ");
		i--;
        }
    }

}