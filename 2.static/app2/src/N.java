class N
{
    static int i = 10;
    static
    {
		System.out.println("N-SIB");
    }
}
class O
{
     static
     {
		System.out.println("O-SIB");
     }
	 public static void main(String[] args)
	 {
         System.out.println("O-main-b");
         System.out.println(N.i);
         System.out.println(N.i);
         System.out.println(N.i);
         System.out.println("O-main-e");
	 }
}
