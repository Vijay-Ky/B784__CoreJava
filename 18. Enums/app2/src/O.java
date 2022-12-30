class O 
{
	public static void main(String[] args) 
	{
		Thread.State states[] = Thread.State.values();
		for(int i = 0; i < states.length; i++)
		{
			System.out.println(states[i]);
		}
	}
}
