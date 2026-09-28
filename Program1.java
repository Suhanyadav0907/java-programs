import java.util.Scanner;
class Program1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter first value: ");
		int a = sc.nextInt();
		System.out.print("enter second value: ");
		int b = sc.nextInt();
		int c = a+b;
		System.out.println("Addition = "+c);
		
	}
}