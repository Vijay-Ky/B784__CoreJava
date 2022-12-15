public class X {

	public static void main(String[] args) {
		String s1 = "abc;xyz;hello;123";
		String[] splits = s1.split(";");
		for(String split : splits)
		{
			System.out.println(split);
		}
	}
}
/*
 * String class contains split method
 * it splits main string into number of strings by making use of a common seperator.
 * we can supply any sepearator it will spit string into no. of strings
 * */
