package Array;

import java.util.Scanner;

public class ArrayPair {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayMethodUser as= new ArrayMethodUser();
		System.out.println("Read array : ");
		int a[]=as.readArray();
		System.out.println("Enter the n value :");
		int n=sc.nextInt();
		as.displayPair(a, n);

	}

}
