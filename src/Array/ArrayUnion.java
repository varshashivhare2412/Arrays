package Array;

public class ArrayUnion {

	public static void main(String[] args) {
		ArrayMethodUser as= new ArrayMethodUser();
		System.out.println("Read array : ");
		int a[]=as.readArray();
		int b[]=as.readArray();
		int u[]=as.union(a,b);
		System.out.println("Unioin : " );
		as.dispArray(u);
	}

}
