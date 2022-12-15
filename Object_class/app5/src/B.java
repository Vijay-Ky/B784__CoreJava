class B
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		B b2 = (B) b1.clone();//downcasting return value of clone method to B type 
		System.out.println("done");
	}
}
/*
clone method is a checked exception type of statement to clone not
supported exception we require either try,catch or throws with
a clone not supported exception.*/

