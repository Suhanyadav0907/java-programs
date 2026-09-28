import java.util.Scanner;
class Program2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in); //buffer memory for input
		System.out.print("enter size of array: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.print("Enter "+n+" value in the array: ");
		for(int i=0; i<n; i++)
		{
			System.out.print("enter value at "+(i+1)+" position: ");
			a[i] = sc.nextInt();
		}
		System.out.println("you have entered: ");
		for(int i:a)
		{
			System.out.print(i+" ");
			
		}
	}
}