package Array;

public class ArrayEvenOdd {

	public static void main(String[] args) {
		ArrayMethodUser as= new ArrayMethodUser();
		System.out.println("Read array : ");
		int a[]=as.readArray();
		int c[]=as.countEO(a);
		System.out.println("Count of even values : "+c[0]);
		System.out.println("Count of odd values : "+c[1]);
				
	}

}
