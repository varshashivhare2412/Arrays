package Array;

import java.util.Scanner;

public class ArraySumOfTwoElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayMethodUser as= new ArrayMethodUser();
		System.out.println("Read first array : ");
		int a[]=as.readArray();
		System.out.println("Read second array : ");
		int b[]=as.readArray();
		System.out.println("Enter the index to add :");
		int in=sc.nextInt();
		a=as.insertArray(a, in, b);
		System.out.println("After adding : ");
		as.dispArray(a);
	}

}
