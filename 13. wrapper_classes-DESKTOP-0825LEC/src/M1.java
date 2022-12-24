public class M1
{
	public static void main(String [] args)
	{
		int i = 0;
		Integer obj = new Integer(i);//boxing
		int k = obj.intValue();//un-boxing
		System.out.println(k);
		System.out.println("done");
	}
}	
//for every primitive data type there is corresponding wrapper class
//all wrapper class available in java.lang package.
//every wrapper class is final class, we can not develop a sub class to a final class
//all wrapper class predusiong immudouble object.
//every wrapper class is sub class to comparable interface. ----
//because of this we can aceheve shorting throw collection API.
//every wrapper class is implementing serializable interface---
//because of this we can serialize wrapper object to the file system.
//in every wrapper class toString method()of object class is overrided.---
//because of this we ca print content of the wrapper object. through its reference ariable.
//in every wrapper class hashcode and equal got overrdided.--
//because of this collection api class can identify---
//duplicate based on the content of the wrappe robject.
//except in Character wrapper class in all the remining wrapper class the are two constructor available.--
//one constructor can taking argument of same type
//other constructor can  taking argument of String type.
// in character wrapper class only one constructor that is taking one argument that is char type.
//except in char wrapper class all remining wrapper class there is procedure conversion a string into corrosponding.
//String can not converting into char.
//in all wrapper classes there is a method to convert a primitive into string.
//wrapper class is used for wrapping primitive contant into object.
	//primitive data type      Wrapper classes 
	//-----------------------    --------------------
 // 1.byte                      Byte
   //2.short                    Short
   // .3int						Integer
  //   4.long					Long
  //   5.float					Float
//     6.double					Double
     //7.char					Character
//     8.boolean				Boolean 
  