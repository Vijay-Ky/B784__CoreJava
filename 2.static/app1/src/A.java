//Global variables and static
class A 
{
	 static int i;//field,property,attribute
	 public static void main(String[] args)
	 {
	    System.out.println(i);
	 }
}
/*1. All the static members gets loaded to the memory while
class is loading.
2. All the static members initialized and executed from top to bottom
only once.
3. All the static members gets executed before the main method only.
4. static variables will be getting the default values 
i,e we dont have to initialize explicitely.
5. All the static members gets loaded to the memory only once when
class is loading to the memory.
*/
