/*The Fibonacci series is a sequence of numbers where 
each number is the sum of the two preceding ones*/
class Fibonacci{
	public static void main (String args[])
	{
		int a=0,b=1,c,i=1,n=7;
		System.out.print(a+" "+b+" ");
		while(i<=n-2)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			i++;
		}
	}
}
//0 1 1 2 3 5 8