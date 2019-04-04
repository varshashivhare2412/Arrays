package Array;
import java.util.Scanner;
public class ArrayMerge {

	public static void main(String[] args) {
		ArrayMethodUser as= new ArrayMethodUser();
		System.out.println("Read first array : ");
		int a[]=as.readArray();
		System.out.println("Read second array : ");
		int b[]=as.readArray();
		System.out.println("Entered first array elements : ");
		as.dispArray(a);
		System.out.println("Entered second array elements : ");
		as.dispArray(b);
		int c[]=as.merge(a, b);
		System.out.println("After merge : ");
		as.dispArray(c);
	}

}
