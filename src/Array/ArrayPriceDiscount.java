package Array;
import java.util.Scanner;
public class ArrayPriceDiscount {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println(" Enter how many items you want : ");
		int n= sc.nextInt();
		int ar[]= new int[n];
		System.out.println("Enter " +n+ " items price to calculate sum and discount on each item's price :");
		for(int i=0; i<ar.length; i++)
		{
			ar[i]=sc.nextInt();	
		}
		double discount=0, sum=0;
		for(int i=0; i<ar.length; i++)
		{
			discount=ar[i]-((0.05)*ar[i]);
			sum=sum+discount;
		}
		System.out.println("Total amount of " +n+ " items after discount of 5% to each item :"+ sum);
	}

}
