import java.util.HashMap;
class M34
{
	public static void main(String[] args) 
	{
		HashMap map = new HashMap();
		map.put("abc", 777);
		map.put(455, "xyz");
		map.put(99.0, true);
		map.put('a', false);
		System.out.println(map);
	}
}