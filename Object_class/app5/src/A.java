//clone method
/*
Original object can be copied through a clone operation. And
Making a duplicate object through clone. object class contains
built in cloning operation. There is a clone method inside object
class. we can copy the content into another place without a
constructor execution. Somehow run time environment creating the
new object from the original copied object content. if we try
to do object cloning manually, it takes lot of time and effort
because consider if an object contains 100s of attribute and the
first step we need to create that object with those 100s
attribute and then create a new object and copy all the
attributes to that newly created object, instead of this lenghty
process we can go for object class clone method return a 
duplicate object, copied object, but to use the object class
clone method we need to follow some conditions, straight away
object class clone method cannot be used. so in case of cloning
security issues for ex: if we have a two keys to the lock for our
home we need to keep both the keys safely.
*/
class A extends Object
{
	
}
class M1 extends A
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		//A a2 =  a1.clone();
		System.out.println("Hello World!");
	}
}
/*
- clone method is a protected method in the object class.
then it has to use in the subclass only. A class clone
should use in the A only. M1 also subclass to object. M1 also
containing a clone. M1 class clone should be used in M1 itself and A
class clone should use in A iteself. protected methods only 
serve to the current subclass.
This is the first condition

-clone method is not developed
for any one class purpose like this A class. clone method is
developed for any type of the classes. clone method return type
is Object type. even though it is A type it is returning A
Object, it is returning in the form of a Object type. We need to
down cast, here we are not down casting.
*/
