import java.io.*;
import java.util.*;
class Minimumvalue
{
public static void main(String args[])
	{
	Scanner input=new Scanner(System.in);
        int size = input.nextInt();
        int a[] = new int[size];
        for(int i = 0; i < size; i++)
        {
	    System.out.println();
            a[i] = input.nextInt();
	    
        }
        int min = a[0];
        for(int j = 0; j < size; j++)
        {
            if(min > a[j])
            {
                min = a[j];
            }
        }
        System.out.println(min);
    }
}


