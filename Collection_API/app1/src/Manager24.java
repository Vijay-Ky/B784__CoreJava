import java.util.ArrayList;
import java.util.Collections;

class D implements Comparable {
	int i;

	D(int i) {

		this.i = i;
	}

	public String toString()// override toString method
	{
		return "i =" + i;
	}

	public int compareTo(Object obj) {
		int result = i - ((D) obj).i;//difference b/w current object this.i with argument Object obj
		System.out.println("comparing " + "this.i: " + this + " and " + "argument object i: " + obj + " and the result:" + result);
		return result;
	}
}

public class Manager24 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new D(9));
		list.add(new D(0));
		list.add(new D(8));
		list.add(new D(2));
		list.add(new D(5));
		list.add(new D(5));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}
/*
-in java.lang package there is an interface called comparable it has only one method called compareTo.
comparable is a single method interface.
-comparing two objects of D based on i value.
-two elements are this.i and the argument.i
-so define a compareTo method in D class to compare the two D class objects.
- return i - ((D)obj).i; We are finding out difference between two D objects i value.
Whenever we try to add elements to the any collection object first thing is that to string method should be overrided. Otherwise we get elements in the form of class name @ decimal representation.
-sort method taking elements of arraylist, those elements of arraylist are comparing by calling 
compareTo method.
- if result is negative value then the current object is less than the argument object.
  if result is positive value then the current object is greater than the argument object.
  -comparable interface is suitable for comparing single attribute classes. not suitable for more than one attribute class.


Compares this object with the specified object for order. Returns a negative integer, zero, or a positive integer as this object is less than, equal to, or greater than the specified object.
*/
