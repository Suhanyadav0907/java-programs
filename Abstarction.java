class Abstarction{
	public static void main(String args[])
	{
		int a=10,b=0,c;
		try
		{
			c=a/b;
			System.out.println("Division ="+c);
			
		}
		catch(ArithmeticException e)
		{
			//System.out.println(e);
			//e.printStackTrace();
			System.out.println("please dont divide by zero");
			
		}
		System.out.println("bye");
}
}