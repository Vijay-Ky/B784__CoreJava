import java.util.ArrayList;
import java.util.Scanner;

public class Manager15 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("Enter an element");
			String s1 = sc.next();
			if(!list.contains(s1))
			{
				list.add(s1);
			}
			System.out.println("do you want to add more? Y/N");
		}while("y".equalsIgnoreCase(sc.next()));		
		System.out.println(list);
	}
}
