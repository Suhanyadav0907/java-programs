class Object2{
	int a=10;
	public static void main(String args[])
	{
	 Object t1= new Object(); 
	 Object t2 = new Object(); 
		System.out.println(t1.a+" "+t1.b+" "+t1.c" ");
		System.out.println(t2.a+" "+t2.b+" "+t2.c" ");
		t1.a=10;
		t1.b=20;
		t1.c=30;
		t2.c=100;
		t2.a=200;
		t2.c=300;
		System.out.println(t1.a+" "+t1.b+" "+t1.c" ");
		System.out.println(t2.a+" "+t2.b+" "+t2.c" ");
		
	}
}