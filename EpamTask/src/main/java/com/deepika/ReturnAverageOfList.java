package com.deepika;
import java.util.*;
import java.lang.*;
import java.io.*;

public class ReturnAverageOfList {
	
	
		public static void main (String[] args) throws java.lang.Exception
		{

	       // Scanner sc = new Scanner(System.in);
	       //System.out.println("Enter the size of the array :: ");
	      //int n = sc.nextInt();
	      //List<Integer> list = Arrays.asList(10, 20, 50, 100, 130, 150, 200, 250, 500);
	       List<Integer> list = new ArrayList<Integer>();
	         for(int i = 1; i<=20; i++)
	         {
	           // int num=sc.nextInt();
	             list.add(i);
	         }
	      int sum = 0;
	      for (int i : list) {
	         sum+=i;
	      }
	      if(list.isEmpty()){
	         System.out.println("Empty list!");
	      } else
	      {
	         System.out.println("Average = " + sum/(float)list.size());
	      }
	   }
	}



