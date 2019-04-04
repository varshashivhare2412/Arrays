package Array;

import java.util.Scanner;

public class ArrayWeightLift {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter number of people :  ");
		int n= sc.nextInt();
		int ar[]= new int[n];
		System.out.println("Enter " +n+ " people's weight :");
		for(int i=0; i<ar.length; i++)
		{
			ar[i]=sc.nextInt();
			if (ar[i]<=890)
			{
				System.out.println("Lift is moving !");
			}
				else
				{
				System.out.println("Lift is not moving !");	
				}
		}
	}

}
