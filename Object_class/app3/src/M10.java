import java.util.HashSet;
class E
{
	int i, j, k;
	E(int i, int j, int k)
	{
		this.i = i;
		this.j = j;
		this.k = k;
	}

	public String toString()
	{
		return "(" + i + "," + j + "," + k + ")";
	}

	public boolean equals(Object obj)
	{
		boolean b1 = (i == ((E)obj).i) && (j == ((E)obj).j) && (k == ((E)obj).k);
		System.out.println("equal between" + this + " and " + obj + " is " + b1);
		return b1;
	}

	public int hashCode()
	{
		int hash = Integer.toString(i).hashCode();
		hash += Integer.toString(j).hashCode();
		hash += Integer.toString(k).hashCode();
		System.out.println("hashCode of " + this + " is " + hash);
		return hash;
	}
}
class M10 
{
	public static void main(String[] args) 
	{
		E e1 = new E(900, 100, 500);
		E e2 = new E(900, 100, 500);
		E e3 = new E(100, 100, 900);
		E e4 = new E(100, 100, 900);
		E e5 = new E(900, 500, 100);
		E e6 = new E(900, 500, 100);
		E e7 = new E(900, 700, 800);
		E e8 = new E(900, 800, 700);
		E e9 = new E(700, 900, 800);
		E e10 = new E(1900, 1100, 1500);
		
		HashSet<E> set = new HashSet<E>();

		set.add(e1);
		System.out.println("--11--");
		set.add(e2);
		System.out.println("--12--");
		set.add(e3);
		System.out.println("--13--");
		set.add(e4);
		System.out.println("--14--");
		set.add(e5);
		System.out.println("--15--");
		set.add(e6);
		System.out.println("--16--");
		set.add(e7);
		System.out.println("--17--");
		set.add(e8);
		System.out.println("--18--");
		set.add(e9);
		System.out.println("--19--");
		set.add(e10);
		System.out.println("--1010--");
		System.out.println(set);
	}
}
/*
what collection api doing internally while identifying duplicates. It is 
maintaining different buckets. to identify duplicates it is
maintaining hashbuckets. it is only calling hashcode
method getting a hash number choosing one bucket for that hash
number storing the first element inside that bucket. So first
element no need of comparing with other elements to avoid the
duplicate, for the first element it doesnt required to check the
duplicates because of its only one element. For the first element
calling hashcode method and getting hash number and that hash
number is allocating to one bucket, storing first element in that
bucket. That bucket is labeled with hash number. while addding
second element e2 again calling hashcode method getting hash
number, checking whether is there any bucket allocated for this
hash number. So already bucket is allocated for the same hash
number, for second element also we will be getting same hash
number. In the same bucket it suppose to store. Now it will be
calling equals method on first element and second element why
because already one element there in the bucket, these elements
are might be duplicate or may not be, so that is why equals 
method is calling between e2 and e1, then equals method returning
a true. If equals method returning a true both are same. e2 is
not adding only e1 is adding succesfuly. e2 is a duplicate to e1
.while adding e3 again it is calling hashcode method, definately
we will be getting a different hash number, so if it is a
different hash number a new bucket is choosing for the new bucket
current hash number is labeling. The third element e3 successfuly
stored in the second bucket. That second bucket is labeled with a
new hash number. So e3 added successfully. while adding e4
again calling hashcode method getting a hash number this hash
number is already allocated to second bucket. Now it is calling
equals method to know whether both are same of different. equals
method is calling between e3 and e4, content wise it is same so
it returns true. Both are same. if equals method returning true
e4 method is not adding. e5 is calling hashcode and e5 is same
hash number of first bucket. This e5 element has to compare with
the first bucket e1 element. Then equals method is calling equals
method comparing attribute by attrubute and we get a false. I,e 
e5 is not same as e1, Then e5 also storing in the first bucket.
first bucket contains 2 elements and second bucket
contains 1 element. Then e6 same hash number same bucket,
already in first bucket two elements are there. So e6 compare
with both, it is comparing first e1 and then only comparing with
e5, in one bucket while storing multiple elements the order will
be maintaining in that bucket. That order is maintaining through
linked list structure. Now e6 should be compared with e1 while
comparing we get false. Then e6 should not add straight away e6
should compared with e5 also because e5 is also there in the same
bucket. e5 and e6 both are calling through equals method. e5 and
e6 both are same returning true. for e7 we
get different hash number and third bucket is allocating, there
is no need to call the equal method, equal method is calling in a
bucket where already some elements are there in the bucket. so it
is a new bucket and doesnt requred to bother about storing
element in the new bucket. e8 is having the same hash number 
of third bucket. but in third bucket already one element is there
and calling equals method. equals method returning false, storing
in the third bucket. e9 is having the same hash number and
going with the third bucket. in the third bucket already two
elements are there. Calling equals method on the first element
getting false. Calling equals method on the second element
getting false. In the third bucket this element is adding
successfuly. e10 has entirely new hash number and choosing
different bucket and in the fourth bucket e10 element will be
stored.

A hashcode is a number generated from any object. This is what
allows objects to be stored/retrieved quickly in a Hashtable.
Imagine the following simple example:
On the table in front of you you have nine boxes, each marked
with a number 1 to 9. You also have a pile of wildly different
objects to store in these boxes, but once they are in there you
need to be able to find them as quickly as possible.
What you need is a way of instantly deciding which box you have
put each object in. It works like an index; you decide to find
the cabbage so you look up which box the cabbage is in, then go
straight to that box to get it.
Now imagine that you don't want to bother with the index, you
want to be able to find out immediately from the object which box
it lives in.
In the example, let's use a really simple way of doing this - the
number of letters in the name of the object. So the cabbage goes
in box 7, the pea goes in box 3, the rocket in box 6, the banjo
in box 5 and so on. What about the rhinoceros, though? It has 10
characters, so we'll change our algorithm a little and "wrap
round" so that 10-letter objects go in box 1, 11 letters in box 2
and so on. That should cover any object.
Sometimes a box will have more than one object in it, but if you
are looking for a rocket, it's still much quicker to compare a
peanut and a rocket, than to check a whole pile of cabbages, peas
, banjos and rhinoceroses.
That's a hash code. A way of getting a number from an object so
it can be stored in a Hashtable. In Java a hash code can be any
integer, and each object type is responsible for generating its
own. Lookup the "hashCode" method of Object.
*/
