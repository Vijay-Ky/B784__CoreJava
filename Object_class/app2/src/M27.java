class J
{
	int x;//primitive
	String s1;//String type

	public boolean equals(Object obj)
	{
		boolean flag = (obj instanceof J) &&
					   (x == ((J)obj).x) &&
					   (
							s1 == null ?
							(((J)obj).s1 == null ? true : false) :
							(((J)obj).s1 == null ? false : s1.equals(((J)obj).s1)) 
					   );
		return flag;
	}
}
class M27 
{
	public static void main(String[] args) 
	{
		J j1 = new J();
		j1.x = 10;
		j1.s1 = "hello";

		J j2 = new J();
		j2.x = 10;
		j2.s1 = "hello";
		
		J j3 = new J();

		j3.x = 10;

		System.out.println(j1.equals(j2));
		System.out.println(j1.equals(j3));
		System.out.println(j2.equals(j3));
		System.out.println(j3.equals(j2));
		System.out.println(j2.equals(j1));
	}
}
/*
1. if this.s1 is a null then will gets executed
   if argument.s1 is also null return true, if not return false.
   if this.s1 is not a null argument.s1 is a null then return false
   otherwise if argument.s1 is not a null it will compare the content 
   of this.s1 and argument.s1.

2. in any way we wont be getting null pointer exception. 
   this is the proper way of overriding equals method.

*/
