import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int p = sc.nextInt();
		    int q = sc.nextInt();
		    if(((p + q) / 2) % 2 == 0){
		        System.out.println("Alice");
		    }
		    else{
		        System.out.println("Bob");
		    }
		}

	}
}
