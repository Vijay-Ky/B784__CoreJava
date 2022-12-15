class G
{
	int i;
	public String toString()
	{
		return "its a type object with i value as :" + i;
	}
}
class M5
{
	public static void main(String[] args) 
	{
		G g1 = new G();
		g1.i = 20;
		System.out.println(g1);
		String s1 = "desc: " + g1;
		System.out.println(s1);
	}
}
/*
1. whenever reference variable adding to the string, from the reference variable toString method is calling.
2. By default object class toString method printing address of the object rather than content(state) of the object.
*/
