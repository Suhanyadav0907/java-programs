class BinarySearch{
		public static void main(String args []){
			int a[]={50,40,20,10,30},n=80,low=0,high=a.length-1,mid;
			boolean f=false;
			while(low<=high)
			{
				mid=(low+high)/2;
				if(a[mid]==n)
				{
					f=true;
					break;
				}
				else if (n>a[mid])
				{
					low=mid+1;
				}
				else
				{
					high=mid-1;
				}
			}
			if(f)
			{
				System.out.print("element found");
				
			}
			else{
				System.out.print("element found");
			}
		}
}