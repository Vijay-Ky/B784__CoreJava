class B
{
	public static void main(String[] args) 
	{
		//to find out the length of array
		System.out.println("Hello World!: " + args.length);
	}
}
/*
F:\OneDrive\Aptech\5FSD\command_line_arguments\app1\src>javac -d ../classes B.java

F:\OneDrive\Aptech\5FSD\command_line_arguments\app1\src>java -cp ../classes B
Hello World!: 0

// by using "," as a seperator we can supply any no. of arguments and any
type of arguments. all are storing as the String array elements. and that are
passes as an argument to the main method.

F:\OneDrive\Aptech\5FSD\command_line_arguments\app1\src>java -cp ../classes B abc
Hello World!: 1

F:\OneDrive\Aptech\5FSD\command_line_arguments\app1\src>java -cp ../classes B abc xyz
Hello World!: 2

F:\OneDrive\Aptech\5FSD\command_line_arguments\app1\src>java -cp ../classes B abc xyz 123
Hello World!: 3

F:\OneDrive\Aptech\5FSD\command_line_arguments\app1\src>java -cp ../classes B abc xyz 123 true
Hello World!: 4

//if you dont supply any commmand line arguments the length of the array is empty
means length with 0. but not null. null means no array.
//empty means array got defined but no elements.

//no matter what type of values we supply all the values will be converting into
String and stored inside the string array.
*/