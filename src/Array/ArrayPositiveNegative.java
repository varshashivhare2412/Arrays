package Array;

public class ArrayPositiveNegative {

	public static void main(String[] args) {
		ArrayMethodUser as= new ArrayMethodUser();
		System.out.println("Read array : ");
		int a[]=as.readArray();
		int b[]= as.PositiveNegativeCount(a);
		System.out.println("Count of positive values : "+b[0]);
		System.out.println("Count of negative values : "+b[1]);
		
	}

}
