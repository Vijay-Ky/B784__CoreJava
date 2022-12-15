import java.sql.DriverManager;
class M7
{
	public static void main(String[] args) throws Exception
	{
		test1();
		System.out.println("done");
	}
	static void test1() throws Exception
	{
		test2(); 
	}
	static void test2() throws Exception
	{
		Class.forName(""); 
		DriverManager.getConnection("");
		Thread.sleep(20000);
	}
}
//all checked exceptions are sub-class to Exception
//we can straightaway go for Exception because all are sub-class to Exeption
