class A
{
}
class B extends A
{
}
class C extends B
{
}
class D extends C
{
}
class E extends D
{
}
class F
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		Object obj = new Object();
		E e1 = (E) obj;
		System.out.println("main end");
	}
}
