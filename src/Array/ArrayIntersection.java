package Array;

public class ArrayIntersection {

	public static void main(String[] args) {
		ArrayMethodUser as= new ArrayMethodUser();
		System.out.println("Read array : ");
		int a[]=as.readArray();
		int b[]=as.readArray();
		int i[]=as.intersection(a, b);
		System.out.println("intersection is :  ");
		as.dispArray(i);

	}

}
