class M3
{
		void test()
		{	
			//clone();//checked type of exception requires try and catch

			try
			{
				clone();	
			}
			catch (CloneNotSupportedException ex)
			{
				ex.printStackTrace();
			}
		}
}
