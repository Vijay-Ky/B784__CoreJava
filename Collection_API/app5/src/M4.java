import java.util.HashMap;
import java.util.Set;
class M4
{
	public static void main(String[] args) 
	{
		HashMap map1 = new HashMap();
		map1.put(null, 777);
		map1.put(555, "xyz");
		map1.put(99.2, true);
		map1.put('a', null);
		map1.put(null, 888);
		
		//to get all the keys, 
		//all the keys are unique
		//keySet method return type is a Set
		//Set is a interface
		//keySet internaly using anonymous innerclass in order to implement subclass to Set type.
		Set keys = map1.keySet();
		System.out.println(keys);
	}
}