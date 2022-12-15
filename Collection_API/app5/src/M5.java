import java.util.HashMap;
import java.util.Set;
class M5
{
	public static void main(String[] args) 
	{
		HashMap map1 = new HashMap();
		map1.put(null, 777);
		map1.put(555, "xyz");
		map1.put(99.2, true);
		map1.put('a', null);
		map1.put(null, 888);
		
		//keys is Set which contains all the keys whichever stored in the HashMap.
		Set keys = map1.keySet();

		//iterating through for-each
		for(Object key : keys)
		{
			System.out.print(key + "     ");
		}
		System.out.println();
		Object value;
		for(Object key : keys)
		{
			value = map1.get(key);
			System.out.print(value + "     ");
		}
	}
}