class A
{
	public static void main(String[] args) 
	{
		//simply printing main method argument
		//args is the argument to main method
		//array address will be printing 
		//we dont care about the address usually
		System.out.println("Hello World!: " + args);
	}
}
/*
F:\OneDrive\Aptech\5FSD\command_line_arguments\app1\src>javac -d ../classes A.java

F:\OneDrive\Aptech\5FSD\command_line_arguments\app1\src>java -cp ../classes A
Hello World![Ljava.lang.String;@15db9742
*/	