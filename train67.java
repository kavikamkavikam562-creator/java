import java.util.*;
import java.lang.*;
import java.io.*;

class train67
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while(n-- > 0){
		    int x = sc.nextInt , y = sc.nextInt();
		    
		    if(x == y /2){
		        System.out.println("ANY");
		    }
		    else if(x > y / 2){
		       System.out.println("FIRST");
		    }
		    else{
		        System.out.println("SECOND";)
		    }
		}

	}
}
