enum G
{
	//if enum contains only constants then ";" is optional
	CON1, CON2, CON3, CON4;
}
class H
{
	public static void main(String[] args)
	{
		//if any type is class, interface or enum then it comes 
		  //under derived datatype
		G g1 = G.CON1;
		G g2 = G.CON2;
		System.out.println(g1);
		System.out.println(g2);
	}
}
