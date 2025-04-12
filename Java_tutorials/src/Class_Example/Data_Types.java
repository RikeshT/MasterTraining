package Class_Example;;

public class Data_Types {

	public static void main(String[] args) {
	//Primitive data type	
		int i = 111223;//Intialization(int i - declaration)
	//Non Primitive data type
		Data_Types DT;
		
		String xyz = "Automation";
		
		String abc = new String();// String is a class
		abc = "Hello";
		
		String abc1 = "Hello";// Java directlty creates the object with out any new String() and stores the value in the reference variable
		
		//String concatination
		//String + String ---> Concatinated String
		String s1= "way";
		String s2 = "2";
		String s3 = s1+s2;//+ is the concatation 
		System.out.println(s3);
		
		int num1 =10;
		int num2=5;
		System.out.println(num1+num2);//Binary values int + int = int
		System.out.println(num1+num2+"after");//concatinating the strings from left to right
		System.out.println("before"+num1+num2+"after");//num1 & num2 is converted to string and concatinated form left to right
		System.out.println("before"+(num1+num2)+"after");//BODMAS rule (everything starts with bracket tested first
//Java Operators
		System.out.println(!false);//logical operator
//Arthemetic Operator		
		System.out.println(38==78);//eqaulity and Relational Operator
	    System.out.println((123<=123) || (10!=10));//Conditional Operators
	
	}

}
