package Array;

public class ArrayPrime {

	public static void main(String[] args) {
		ArrayMethodUser as= new ArrayMethodUser();
		System.out.println("Read array : ");
		int a[]=as.readArray();
		int b=as.primeNumber(a);
		System.out.println("Total prime number in given array : "+ b);

	}

}
