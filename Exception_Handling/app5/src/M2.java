class M2 
{
	public static void main(String[] args) 
	{
		//Class.forName("");//checked type of exception requires try and catch
		try
		{
			Class.forName("");
		}
		catch (ClassNotFoundException ex)
		{
			System.out.println(ex);
			ex.printStackTrace();
		}
		System.out.println("done");
	}
}
