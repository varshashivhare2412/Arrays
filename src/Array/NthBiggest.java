package Array;

import java.util.Scanner;

public class NthBiggest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayMethodUser as= new ArrayMethodUser();
		System.out.println("Read array : ");
		int a[]=as.readArray();
		System.out.println("which biggest you want :");
		int n=sc.nextInt();
		int big=as.nthBiggest(a,n);
		System.out.println(big);
		

	}

}
