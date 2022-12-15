class M extends Thread
{
	M(String name)
	{
		super(name);
	}
	@Override
	public void run() {
		System.out.println("---------------------");
	}
}
public class M17 {

	public static void main(String[] args) {
		//through constructor specifying the name
		M m1 = new M("my first thread");
		m1.start();
		System.out.println(m1.getName());
		m1.setName("first child");
		System.out.println(m1.getName());
	}
}
