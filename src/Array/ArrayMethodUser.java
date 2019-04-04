package Array;

import java.util.Scanner;

public class ArrayMethodUser 
{

		int[] readArray() 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println(" Enter values:  ");
			int n= sc.nextInt();
			int ar[]= new int[n];
			System.out.println("Enter " +n+ " interger values : ");
			for(int i=0; i<ar.length; i++)
			{
				ar[i]=sc.nextInt();
			}
			return ar;
		}
		


	
	void dispArray(int[]ar)
	{
		for (int i=0; i<ar.length; i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
	}




	
	int[] merge (int x[], int y[])
	{
		int z[]=new int[x.length+y.length];
		for (int i=0; i<x.length; i++)
		{
			z[i]=x[i];
		}
		for(int i=0; i<y.length; i++)
		{
			z[x.length+i]= y[i];
		}
		return z;
	}
	
	int biggestArray(int ar[])
	{
		int big=ar[0];
		for (int i=1; i<ar.length; i++)
		{
			if(big<ar[i])
				big=ar[i];
		}
		return big;
	}
	
	
	int[] countEO(int ar[])
	{
		/*
		 * int ec=0, oc=0;
		 * for (int i=1; i<ar.length; i++)
		 * {
		 * if(ar[i]%2==0 )
		 * ec++;
		 * else
		 * oc++;
		 * }
		 * int count[]={ec,oc};
		 * return count; */
		 
		int count[]= {0,0};
		for (int i=0; i<ar.length; i++)
		{
			count[ar[i]%2]++;
		}
	return count;
	}
	
	
	
	
	int smallestArray(int ar[])
	{
		int small=ar[0];
		for (int i=1; i<ar.length; i++)
		{
			if(small>ar[i])
				small=ar[i];
		}
		return small;
	}	
	
	
	 int[] PositiveNegativeCount(int ar[])
	{
		 int pc=0, nc=0;
		 for (int i=0; i<ar.length; i++)
		 {
		 if(ar[i]<0 )
		 nc++;
		 else
		 pc++;
		 }
		 int count[]={pc,nc};
		 return count; 
		 
	}
		 
	 
	 void PositiveNegative(int ar[])
	 { 
		for (int i=0; i<ar.length; i++)
		if(ar[i]<0)
		{
			System.out.println(ar[i] + " is a negative number!" );
		}
			else
			{
				System.out.println(ar[i] + " is a positive number!");
			}
	
		}
	
	int primeNumber(int[] x)
	{
		int count =0;
		for(int i=0;i<x.length; i++)
		{
			if(isPrime(x[i]))
			{
				count++;
			}	
		}
		return count;
	}
		
		public boolean isPrime(int x)
		{
		int i=2;
		while(i<=x/2)
		{
			if(x%i==0)
			return false;
			i++;
		}
	return true;
}
		
int[] mergeSort(int a[], int b[])
	{
	int c[]=new int[a.length+b.length];
	int i=0, j=0, k=0;
		while (i<a.length&&j<b.length)
			if(a[i]<b[j])
			{
				c[k++]=a[i++];
			}
			else
			{
			c[k++]=b[j++];	
			}
		 
	
	while(i<a.length)
	{
		c[k++]=a[i++];
	}
	while(j<b.length)
	{
		c[k++]=b[j++];
	}
		
	return c;	
}

int  nthBiggest (int ar[], int n)
{
		for(int i=0;i<ar.length; i++)
		{
			int count=0;
			for(int j=0;j<ar.length; j++)
			{
				if(ar[j]>ar[i])
					count++;
			}
			if(count==n-1)
				return ar[i];
		}
		return 0;
}

public void displayPair(int[] ar, int n)
{
	for (int i=0;i<ar.length-1; i++)
	{
		for (int j=i+1;j<ar.length; j++)
		{
		if (ar[i]+ar[j]==n)
		{
			System.out.println(ar[i]+" "+ar[j]);
		}
		}
	}
}

public void noOfOccurance(int[] ar)
{/*
	for(int i=0; i<ar.length; i++)
	{
		int count=1;
		for(int j=i+1; j<ar.length; j++)
		{
			if(ar[i]==ar[j]&&ar[j]!=-1)
			{
				count ++;
				ar[j]=-1;
			}
		}
		if (ar[i]!=-1)
		System.out.println(ar[i]+"->"+count);
	}
}*/

int n=ar.length;		
	for(int i=0;i<n; i++)
		{
			int count=1;
			for(int j=i+1;j<n;j++) 
			{
				if(ar[i]==ar[j])
				{
					count ++;
					ar[j]=ar[n-1];
					n--;
					j--;
				}
			}
			System.out.println(ar[i]+"->"+count);
		}

	}


	int[] uniqueArray(int ar[])
	{
	int n=ar.length;
	for(int i=0; i<n; i++)
	{
		for (int j=i+1; j<n; j++)
		{
			if(ar[i]==ar[j])
			{
				int k=j;
				while(k<n-1)
				{
					ar[k]=ar[k+1];
							k++;
				}
				n--;
				j--;
			}
		}
	}
	int na[]=new int[n];
	for (int i=0; i<n; i++)
	{
		na[i]=ar[i];
	}
	return na;
	}
	
 	
	
	
	
	 public int[] union(int[] f, int[] s)
	 {
		 int u[]= new int[f.length+s.length];
		 int i=0;
		 for(; i<f.length; i++)
		 {
			 u[i]=f[i];
		 }
		 for (int j = 0; j < s.length; j++) 
		 {
			int find=1;
			for (int k = 0; k < i; k++) 
			{
				if(u[k]==s[j])
				{
					find=0;
					break;
				}
			}
			if(find==1)
			{
				u[i]=s[j];
				i++;
			}
		 }
		 
		 int nu[]=new int[i];
		 for (int j = 0; j < nu.length; j++) 
		 {
			nu[j]=u[j];
		 }
		 return nu;
	 }
	 
	public int[]  intersection(int[] f, int[] s)
	{
		int ni[];
		if(f.length<s.length)
			ni=new int[f.length];
		else
			ni= new int[s.length];
		int k=0;
		for(int i=0; i<f.length; i++)
		{
			for (int j=0; j<s.length; j++)
			{
				if(f[i]==s[j])
				{
					ni[k]=f[i];
					k++;
					break;
				}
			}
		}
		int nin[]=new int[k];
		for (int i = 0; i < nin.length; i++) 
		{
		nin[i]=ni[i];	
		}
		return nin;
	
	}
	
	
	int[] insertingEle(int a[], int in, int ele)
	{
		if(in<0||in>a.length)
		{
			System.out.println("Index not in the range : ");
			return a;
		}
		int na[]= new int[a.length+1];
		for(int i=0; i<a.length; i++)
		{
			if (i<in)
				na[i]=a[i];
			else
				na[i+1]=a[i];
		}
		na[in]=ele;
		return na;
	}
	
	
public int[] deleteEle(int[] a, int in)	
{
	if (in< 0|| in>=a.length)
	{
		System.out.println("Index not in the range :");
		return a;
	}
	int na[]=new int[a.length-1];
	for (int i = 0; i < na.length-1; i++) 
	{
		if(i<in)
			na[i]=a[i];
		else
			na[i]=a[i+1];
	}
	
	return na;
}
	
public int[] insertArray(int[] a, int in, int[] b)	
{
	if (in< 0|| in>=a.length)
	{
		System.out.println("Index not in the range :");
		return a;
	}
	int na[]=new int[a.length+b.length];
	for (int i = 0; i < a.length; i++)
	{
		if(i<in)
			na[i]=a[i];
		else
			na[i+b.length]=a[i];
	}
	for (int i = 0; i < b.length; i++) 
	{
		na[i+in]=b[i];
	}
	return na;
}
	


	int [] deleteArray(int ar[], int ele)
	{
		int in=-1;
		for (int i = 0; i < ar.length; i++) 
		{
			in=i;
			break;	
		}
	
	if(in==-1)
	{
		System.out.println("Element not found : ");
		return ar;
	}
	return deleteArray(ar,in);
 
}
}


