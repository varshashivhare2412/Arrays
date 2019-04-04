package Array;

import java.util.Scanner;

public class ArrayDeleteEle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayMethodUser as= new ArrayMethodUser();
		System.out.println("Read array : ");
		int a[]=as.readArray();
		System.out.println("Enter the index to delete :");
		int in=sc.nextInt();	
		System.out.println("Before deleting ");
		as.dispArray(a);
		a=as.deleteEle(a,in);
		System.out.println(" After delete : ");
		as.dispArray(a);
	
	}

}
