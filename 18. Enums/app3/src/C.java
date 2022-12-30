import java.util.EnumSet;

enum B
{
	abc, xyz, test;
}
class C 
{
	public static void main(String[] args) 
	{
		EnumSet<B> set = EnumSet.of(B.abc, B.xyz, B.test);
		
		for(B b1 : set)
		{
			System.out.println(b1);
		}
	}
}
