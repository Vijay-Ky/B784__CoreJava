class Q extends Thread
{
	@Override
	public void run() {
		for(int i = 1; i <= 100; i++)
		{
			System.out.println(i);s
		}
	}
}
public class M20 {

	public static void main(String[] args) {
		Q q1 = new Q();
		q1.start();
		System.out.println("done");
	}
}

/*
- child thread is the user thread. user thread is not depending on its
parent.
*/