/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner (System.in);
		int tc = sc.nextInt();
		for(int i=0; i<tc; i++){
		  int x = sc.nextInt();
		  int y = sc.nextInt();
		  if(y>x){
		    System.out.println("PROFIT");
		  }
		  else if(y<x){
		    System.out.println("LOSS");
		  }
		  else{
		    System.out.println("NEUTRAL");
		  }
		  
		}
	}
}
