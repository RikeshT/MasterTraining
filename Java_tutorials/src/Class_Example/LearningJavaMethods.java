package Class_Example;

public class LearningJavaMethods {
	
	//Method Declaration
	int i =100;
	//Display
	//void- Return type: This will be define the what the method actually return i.e. datatype of the value returned by method.
	//return type should be the int, char, String. If we put datatype in return type then compiler will thorw an error.
	//Then in that case we need to add the Keyword- return
	//If there is no need pf return any value then return type should be "void"
	public int display(int k, String s)//declare method--> define
	{
		/**
		 * 
		 * To define the method all the definitions goes here.
		 * 
		 */
		int x =10;
		return x;
	}
	public void run() {
		
	}

	public static void main(String[] args) {
		LearningJavaMethods learn = new LearningJavaMethods();// copy of class when creates the object, it  holds the all the methods inside the class.
		learn.run();//calling the method by the reference of the object i.e. reference variable
		System.out.println("Hello");
		
		Home h = new Home();//h-->object1-->i=123
		h.i++;//object1--->i=124
		
		Home h1 = new Home();//h1-->object2-->i=123
		h1.i++;//object2--->i=124
		
		Home h2 = new Home();//h2-->object3-->i=123
		System.out.println(h2.i);//i=123--->output
		
		Home h3 = new Home();
		h3.l++;
		h3.l++;
		System.out.println(h3.l);
		
		calcualtor cal = new calcualtor();
		cal.add(10, 10);//arguments
		cal.sub(10, 10);
		cal.mul(10, 10);
		cal.div(10, 10);

	}

}
