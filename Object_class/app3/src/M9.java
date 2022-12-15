class D
{
	int i, j;
	D(int i, int j)
	{
		this.i = i;
		this.j = j;
	}
	public int hashCode()
	{
		String s1 = Integer.toString(i);
		String s2 = Integer.toString(j);
		int hash = s1.hashCode();
		System.out.println(s1.hashCode() + ", "  + s2.hashCode());
		hash += s2.hashCode();
		System.out.println("final hashcode is: " + hash);
		return hash;
	}
}
class M9
{
	public static void main(String[] args) 
	{
		D d1 = new D(10, 20);
		D d2 = new D(10, 20);
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
		D d3 = new D(20, 10);
		System.out.println(d3.hashCode());
		D d4 = new D(200, 100);
		System.out.println(d4.hashCode());
	}
}
/*
Object class
equals method evaluating two references. Object class hascode
method we can can evaluated two objects addresses. we dont want
object class hashcode and equals method, instead we can override
object class hashcode and equals method mainly to compare two
objects content sun people developed hashcode and equals method
for comparision purpose generaly both are related to memory 
hashcode method returns memeory address and equals method also
related to memeory only that it is checking both references are
pointing to same object or different object both methods we are
using for evaluation purpose, one object identifying equality
with other object in case of hashcode no if block at all if
any derived attribute is there then only we required if block.
incase of equals method lot of if block and lot boolean
expressions and it will take more time. definately equals
method taking more time than hashcode method. hashcode method
doesnt have any boolean expressions,it is only having caluculations.
d4 giving different hash number because content is varying d1
,d2,d3 giving same hash numbers advantage is very good
performance but disadvantage is not accurate  d1 and d2 both
are same then hash number also same, but d1 and d3 are different
but hashcode is same, d1 and d4 both are different and hash
number also diferent so it is causing confusion, ex: assume we 
have two persons and we should compare first person weight should
be compared with second person weight only and first person
height should be compared with second person height only but not
like first person height compared with second person weight. Its
not meaningful if two objects hashcodes are same we cannont
confirm whether they are same or not, we get confusion because d1
and d2 are same hash number and content also same but d1 and d3
hash number are same but the content is diferent so we can
confirm like, if two objects hash number is different then
content will be different. if two objects hash number is same
then we cant be sure that they are same. so limitation is
unable to find equality but it is perfect in case of inequality.
so use hashcode only in case of inequal and dont rely on two
objects same hash number. dont consider equality in case of
hashcode but consider inequality for utimate performance
consider inequality of hash number but for equality purpose dont
use the hashcode. in case of unavoidable scenario go for equals
method that, two objects with the same hashcode. if two objects 
hash number same then call equals method, if equals method
returns true both are same if it returns false both are
different. But dont call equals method in the without second
thought because equals method taking more time but it is giving
accurate result everytime because it is comparing attribute by
attribute and giving accurate results. first we are converting
i and j value to string and calling hashcode. sum of s1 hashcode
and s2 hash code we are returning. performace wise hashcode
method is faster than equals method.
*/
