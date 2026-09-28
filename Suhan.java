class Suhan{
	public static void main(String args[]){
		BufferReader reader =  null;
		try{
			InputStreamReader isr = new InputStreamReader(System.in);
			reader = new BufferedReader(isr);
			System.out.print("enter some text");
			String line = reader.readLine();
			
			System.out.print("you entered: " + line);
		}
		catch(IOexception e){
			e.printStackTrace();
		}
		finally{
			try{
				if (reader != null)
					reader.close();
			}
			catch(IOexception ex)
			ex.printStackTrace();
			
		}
	}
}