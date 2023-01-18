import java.util.HashMap;
import java.util.Set;
class M39
{
	public static void main(String[] args) 
	{
		HashMap map = new HashMap();
		map.put(null, 777);
		map.put(null, 888);
		map.put(455, "xyz");
		map.put(99.0, true);
		map.put('a', null);

		Set keys = map.keySet();
		System.out.println(keys);

		System.out.println("-------------");

		Object value;
		for(Object key : keys)
		{
			value = map.get(key);
			System.out.println(key + " : " + value);
		}

	}
}