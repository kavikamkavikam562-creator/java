import java.util.*;
import java.lang.*;
import java.io.*;

class train65
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while(n-- > 0){
		    int x = sc.nextInt();
		   if(x <= 50){
		       System.out.println("LEFT");
		   }
		   else{
		       System.out.println("RIGHT");
		   }
		}

	}
}

