import java.util.HashMap;
class M3 
{
	public static void main(String[] args) 
	{
		HashMap map1 = new HashMap();
		map1.put(null, 777);
		map1.put(555, "xyz");
		map1.put(99.2, true);
		map1.put('a', null);
		map1.put(null, 888);
		System.out.println(map1);
		//get method argument and return types are Object type.
		String s1 = (String) map1.get(555);
		System.out.println(s1);

		//if key is not available it returns a null
		String s2 = (String) map1.get(111);
		System.out.println(s2);
	}
}