public class B {
	public static void main(String[] args) {
		int[][] a = new int[][] {{10, 20}, {30, 40}};
		int[][] b = new int[][] {{10, 20}, {30, 40}};
		

		System.out.println(a[0][0]);
		System.out.println(a[0][1]);
		System.out.println(a[1][0]);
		System.out.println(a[1][1]);

		System.out.println(b[0][0]);
		System.out.println(b[0][1]);
		System.out.println(b[1][0]);
		System.out.println(b[1][1]);

		for(int i = 0; i < 2; i++)//rows
		{
			for(int j = 0; j < 2; j++)//columns
			{
				//1st 10 + 10 = 20
				//2nd 20 + 20 = 40
				//3rd 30 + 30 = 60
				//4th 40 + 40 = 80
				System.out.println("addition: " +  (a[i][j] + b[i][j]));
			}
		}
	}
}
