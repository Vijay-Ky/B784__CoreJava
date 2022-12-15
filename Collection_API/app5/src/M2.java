import java.util.HashMap;
class M2 
{
	public static void main(String[] args) 
	{
		//HashMap is allowing null as a key and null as a value
		//inside a HashMap one bucket is allocating for the null entry
		  //if at all the key is null that is storing in the seperate bucket.
		  //it wont call hashcode and equals method and	
		  //while storing in the hashbucket it is calling hashcode and equals
		   //method only on keys not values to identify duplicates
		HashMap map1 = new HashMap();
		map1.put(null, 777);
		map1.put(555, "xyz");
		map1.put(555, "abac");
		map1.put(99.2, true);
		map1.put('a', null);
		//one bucket is reserved for null already one null entry is there in
		  //the bucked, it will replace that null with this null entry.
		  //without calling hashcode or equals.
		map1.put(null, 888);
		System.out.println(map1);
	}
}

//