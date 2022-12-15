//Map
import java.util.HashMap;
class M1 
{
	public static void main(String[] args) 
	{
		HashMap map1 = new HashMap();
		//put(key, value) method both two arguments are object datatype
		//while storing key and value it is storing in the form of entry object.
		//any datatype for the key and value
		map1.put("abc", 777);
		map1.put(555, "xyz");
		map1.put(99.2, true);
		map1.put('a', false);
		//key and value as one entry.
		//order of addition not preserved for that go for LinkedHashMap.
		System.out.println(map1);
	}
}

//