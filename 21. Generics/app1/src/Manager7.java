class G <X>
{
	X i;

	G(X k, int j)
	{
		this.i = k;
	}	
}
class Manager7
{
	public static void main(String[] args) 
	{
		G<String> g1 = new G<String>("abc", 10);
		G<Integer> g2 = new G<Integer>(20, 40);
		G<Boolean> g3 = new G<Boolean>(true, 60);
		
		System.out.println(g1.i);
		System.out.println(g2.i);
		System.out.println(g3.i);
		System.out.println("done");
	}
}
