package pack1;
import pack1.pack11.L;
import pack2.M;
import pack2.pack22.N;
public class O {
	public static void main(String[] args) {
		System.out.println(1);
		assert false;
		System.out.println(2);
		L.test2();
		System.out.println(3);
		N.test4();
		M.test3();
		System.out.println(5);
	}
}

/*
 1. -ea:pack2...
   //enable in pack2 and sub packages of pack2 (pack2.pack22) members
 
 
 2. -ea:pack2.M
   //enable only in the M class
 
 3. -ea -da:pack1...
   //enable in pack2 and subpackages of pack2 (pack2.pack22) members
   
 4. -ea -da:pack1...  -da:pack2.pack22.N
 	//enable only in the M class
 */
    
