//0/0 + 1/2 + 2/4 + 3/6 + 4/8 + 5/10 + 6/12 + 7/14 + 8/16 + 9/18 + 10/100
class Loop3
{
	public static void main (String args[]){
		int i=0;
		while(i<=9)
		{
			System.out.print(i+"/"+(i+i)+" + ");
			i++;
		}
			System.out.println(i+"/"+(i*i));//10/100
		
	}
}
