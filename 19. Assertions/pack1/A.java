package pack1;

public class A {
	public static void main(String[] args) {
		System.out.println(1);
		//it can be boolean result, expression, variable
		assert false;
		System.out.println(2);
	}
}
/*
 1. by default no assert statement will be executing.
 2. in order to execute assert statement we need to supply on vm argument.
 3. like throw keyword we can raise assertion error
 */
/*
1. assert is a keyword from jdk 1.4 onwards.
2. There are two types of assert statements
  1. VSA
  --------
  assert boolean_result;
  
  2.SA
  --------
  assert boolean_result : some_message;
   
   (VM arguments)
  
  -ea  (or) -enableassertions
  
  -da  (or) -disableassertions (by default assertion is disabled)
  
  enable/disable
  --------------
  1. execution wise
  2. package and its sub-package wise
  3. class wise
  
  	
  usage
  ----------
  raising AssertionError, whenever business rule got failed.
  
  
*/