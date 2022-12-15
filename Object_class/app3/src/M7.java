class M7 
{
	public static void main(String[] args) 
	{
		Integer obj1 = 100;
		Integer obj2 = new Integer(100);
		Character obj3 = 'a';
		Character obj4 = new Character('a');
		Boolean obj5 = true;
		Boolean obj6 = new Boolean(false);
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
		System.out.println(obj4.hashCode());
		System.out.println(obj5.hashCode());
		System.out.println(obj6.hashCode());
	}
}
/*
in every
wrapper class hashcode method got overrided and returning same
value not an address. in String, Wrapper, Collection classes
toString(), equals(), hashcode() overrided. in StringBuffer and 
StringBuilder class only toString() got overrided not the
hashCode() and equals().
*/