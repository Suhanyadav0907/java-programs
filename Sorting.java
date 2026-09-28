class Sorting{
	public static void main(String args []){
		int a[]={50,40,20,10,30},i,j,temp;
		
		System.out.print("before sorting: ");
		for(i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		for(i=0; i<a.length-1; i++)
		{
			for(j=i+1; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.print("\n after sorting: ");
		for(i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}