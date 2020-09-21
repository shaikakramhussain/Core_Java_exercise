//4) Write code for calculating sum of diagonal elements(TopLeft to BottomRight) of an array of size 3 X 3.
package com.PracticalAssessment;
import java.io.*; 
public class SumOfDiagnolElements { 
	 
 static void getDiagonalSum (int [][]mat, int n) 
 { 
     int sum = 0;
     for (int i = 0; i < n; i++) { 
    	 sum += mat[i][i];  
     } 
     System.out.println("sum of diagonal elements(TopLeft to BottomRight) of an array:"+ sum);                         
 } 

 // Driver code 
 static public void main (String[] args) 
 { 
       
     int [][]a = { { 1, 2, 3 }, 
                   { 1, 8, 3 },                    
                   { 1, 2, 4 } }; 
     getDiagonalSum(a, 3); 
 } 
} 

