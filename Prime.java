class Prime{
	public static void main(String args[]){
		int n=7;
		boolean f=false;
		for(int i=2; i<=n/2; i++)
		{
			if(n%i==0)
			{
				f=true;
				break;
			}
		}
		if(f)
		{
			System.out.println("non prime");
			
		}
		else
		{
			System.out.print("prime");
		}
	}
}