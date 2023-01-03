import java.util.ArrayList;
class M9 
{
	@SuppressWarnings({"unchecked", "deprecation"})
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(900);
		list.add(9000);
		System.out.println(list);

		Thread t1 = new Thread();
		t1.stop();//deprecated method
	}
}
