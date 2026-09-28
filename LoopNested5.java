class LoopNested5{
	public static void main(String args[]){
		for(int i=5; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
/*
print(j)
12345
1234
123
12
1
print(i)
55555
4444
333
22
1
