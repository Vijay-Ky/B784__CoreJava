class Z1
{
     static int i = test();
     static int test()
     {
		System.out.println("from test");
		return 10;
     }
     public static void main(String[]args)
     {
		System.out.println("main begin");
        System.out.println(i);
        System.out.println("main end");
     }
}
