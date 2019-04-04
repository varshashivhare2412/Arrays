package Array;

public class ArraySmallest {

	public static void main(String[] args) {
		ArrayMethodUser as= new ArrayMethodUser();
		System.out.println("Read array : ");
		int a[]=as.readArray();
		int b= as.smallestArray(a);
		System.out.println("Smallest number of the given array : "+b);
	}

}
