package Array;

import java.util.Scanner;

public class NoOfOccurance {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayMethodUser as= new ArrayMethodUser();
		System.out.println("Read array : ");
		int a[]=as.readArray(); 
		as.noOfOccurance(a);

	}

}
