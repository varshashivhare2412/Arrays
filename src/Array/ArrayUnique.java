package Array;

public class ArrayUnique {

	public static void main(String[] args) {
		ArrayMethodUser as= new ArrayMethodUser();
		System.out.println("Read array : ");
		int a[]=as.readArray();
		System.out.println("Before removing the dupilcate elements : ");
		as.dispArray(a);
		a=as.uniqueArray(a);
		System.out.println("After removing the dupilcate elements : ");
		as.dispArray(a);

	}

}
