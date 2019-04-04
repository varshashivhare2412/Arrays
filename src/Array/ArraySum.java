package Array;
import java.util.Scanner;
public class ArraySum {

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
		int sum=0;
		for(int i=0; i<ar.length; i++)
		{
			sum=sum+ar[i];
		}
	System.out.println("Sum of" +n+ "interger value :"+ sum);
}
}
