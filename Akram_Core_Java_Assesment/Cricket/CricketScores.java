package com.assesment;

import java.util.Scanner;

public class CricketScores {
  public static String getDisplayDetails(int runs, float overs)
  {
	  float lastOverDigit=overs*10%10;
	  int exaxtOvers=(int) (overs*10/10);
	  float exaxtOvers2=exaxtOvers;
	  int totalballs=(int) (exaxtOvers2*6+lastOverDigit);
	  
	  float zzz=(float)runs/totalballs;
	 if(totalballs<100)
	 {
		
		 System.out.println(runs+" runs in "+totalballs+" balls @ "+zzz +" runs per ball");
	 }
	 else
	 {
		 float zzz1=(float)runs/overs;
		 System.out.println(runs+" runs in "+overs+" overs @ "+zzz1 +" runs per over");
	 }
	  return null;
	  
  }
	public static void main(String[] args) {
				Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Runs");
		int runs=scanner.nextInt();
		System.out.println("Enter the overs");
		float overs=scanner.nextFloat();
		getDisplayDetails(runs, overs);

	}
}