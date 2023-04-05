package day2;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		int[] a=new int[6];
		int sum=0;
		double avg=0;
		 Scanner sc = new Scanner(System.in);
		System.out.println("enter numbers");
		for(int i=1;i<a.length;i++) {
			a[i]=sc.nextInt();
			sum+=a[i];
			avg=sum/i;}
		
		System.out.println(avg);
		 
			
		

	}
}

