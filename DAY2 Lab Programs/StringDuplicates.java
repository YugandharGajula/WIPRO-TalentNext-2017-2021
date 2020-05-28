import java.util.*;
import java.io.*;
public class StringDuplicates 
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the String to remove duplicates:");
        String str=in.nextLine();
        System.out.print("String after removing duplicates is"+":");
        System.out.println(RemoveDuplicates(str));
    }
    public static String RemoveDuplicates(String str)
    {
        String str1=new String();
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(str1.indexOf(c)<0)
            {
                str1=str1+c;
            }
        } 
        return str1;
    }
}