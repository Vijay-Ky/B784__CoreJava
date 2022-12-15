class J extends Thread
{
	public void run() {
		//straight away you can call all these methods
	System.out.println(getName());
	System.out.println(isDaemon());
	System.out.println(getId());
	System.out.println(getPriority());
	}
}
public class M10 {

	public static void main(String[] args) {
		J ref = new J();
		ref.start();
	}

}
