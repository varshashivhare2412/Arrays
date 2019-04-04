package Array;

import java.util.Scanner;

public class ArrayAverage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter values:  ");
		int n= sc.nextInt();
		int ar[]= new int[n];
		System.out.println("Enter " +n+ " interger values on that you want to perform operation :");
		for(int i=0; i<ar.length; i++)
		{
			ar[i]=sc.nextInt();
		}
		double sum=0, avg=0;
		for(int i=0; i<ar.length; i++)
		{
			sum=sum+ar[i];
			avg=sum/n;
		}
	System.out.println("Average of " +n+ " interger value :"+ avg);

	}

}
