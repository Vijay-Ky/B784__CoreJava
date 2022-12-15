package app3;

public class B {
	public static void main(String[] args) {
		int[][] a = new int[][] {{10, 20}, {30, 40}};
		int[][] b = new int[][] {{10, 20}, {30, 40}};
		
		for(int i = 0; i < 2; i++)
		{
			for(int j = 0; j< 2; j++)
			{
				System.out.println("addition: " +  (a[i][j] + b[i][j]));
			}
		}
	}
}
