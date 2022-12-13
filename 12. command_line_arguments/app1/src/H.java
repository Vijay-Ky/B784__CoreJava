class H
{
	public static void main(String[] args) 
	{
		for(String arg: args)
		{
			System.out.println("argument: " + arg);
		}
	}
}
/*
supplying space as a part of the command line argument
F:\OneDrive\Aptech\5FSD\command_line_arguments\app1\src>java -cp ../classes H "vijay kumar ky"
argument: vijay kumar ky

F:\OneDrive\Aptech\5FSD\command_line_arguments\app1\src>java -cp ../classes H 'vijay' 'kumar' 'ky'
argument: 'vijay'
argument: 'kumar'
argument: 'ky'

F:\OneDrive\Aptech\5FSD\command_line_arguments\app1\src>java -cp ../classes H "vijay kumar" "and sons"
argument: vijay kumar
argument: and sons
*/
