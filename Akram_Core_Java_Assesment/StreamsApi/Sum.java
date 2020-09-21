package com.StreamsApi;

import java.util.Scanner;

public class Sum {
  static Scanner scanner=new Scanner(System.in);
	public static int sumOfDiagonalOfMatrix(int a,int b)
	{
		int result=0;
		if(a==3&&b==3)
		{
		System.out.println("enter the elements in the matrix");
		int array[][]=new int[a][b];
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				array[i][j]=scanner.nextInt();
			}	
		}
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				if(i==j)
				{
					result=result+array[i][j];
				}
			}	
		}
		return result;
		}
		else
		{
			return -1;

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.out.println("Enter the row of matrix");
int row=scanner.nextInt();
System.out.println("Enter the column of matrix");
int column=scanner.nextInt();
int result=sumOfDiagonalOfMatrix(row,column);
System.out.println(result);
	}
}
