import java.util.HashMap;
class M36
{
	public static void main(String[] args) 
	{
		HashMap map = new HashMap();
		map.put(null, 777);
		map.put(455, "xyz");
		map.put(99.0, true);
		map.put('a', null);
		map.put('a', null);
		map.put('a', null);
		System.out.println(map);
	}
}