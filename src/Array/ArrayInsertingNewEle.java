package Array;

import java.util.Scanner;

public class ArrayInsertingNewEle {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ArrayMethodUser as= new ArrayMethodUser();
		System.out.println("Read array : ");
		int a[]=as.readArray();
		System.out.println("Enter the index to add :");
		int in=sc.nextInt();
		System.out.println("Enter the element to insert :");
		int ele=sc.nextInt();
		System.out.println("Before adding ");
		as.dispArray(a);
		a=as.insertingEle(a,in,ele);
		System.out.println(" After adding ");
		as.dispArray(a);
	}

}
