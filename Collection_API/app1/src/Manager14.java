import java.util.ArrayList;
public class Manager14 extends ArrayList {
	public static void main(String[] args) {
		Manager14 list = new Manager14();
		list.add(1);
		list.add(0);
		list.add(3);
		list.add(4);
		list.add(7);
		list.add(9);
		list.add(10);
		list.add(20);
		list.add(8);
		System.out.println(list);
		list.removeRange(2, 6);//remove range method is protected method..we can not use straight away, without sub-class 
		System.out.println(list);
	}

}
