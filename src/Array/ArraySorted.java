package Array;

public class ArraySorted {

	public static void main(String[] args) {
		ArrayMethodUser as= new ArrayMethodUser();
		System.out.println("Read array : ");
		int a[]=as.readArray();
		int b[]=as.readArray();
		int c[]=as.mergeSort(a, b);
		as.dispArray(c);
		

	}

}
