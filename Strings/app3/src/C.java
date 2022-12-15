public class C {
	public static void main(String[] args) {
		String s1 = "java";// creating constant
		String s2 = "ja" + "va";//left side perfect constant as well as right
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}
//+ operator treating "ja" + "va"; as a constant bcz no reference left or right side.
//+ operator if it not found reference either left of right then the result will be considered as constant.
//+ operator if found reference either left of right or both then it uses a new operator.creating a new object.
//s2 results in java
//s2 will be point to the same object where s1 points

//true
//ture