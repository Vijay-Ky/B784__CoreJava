class G <E>
{
	E attr1;
	G(E attr1, int i)
	{
		this.attr1 = attr1;
	}
}
class Manager6
{
	public static void main(String [] args)
	{
		G <String> g1 = new G <String> ("abc", 20);
		G <Integer> g2 = new G <Integer> (40, 20);
		G <Double> g3 = new G <Double> (4.90, 20);
		System.out.println("done");
	}
}