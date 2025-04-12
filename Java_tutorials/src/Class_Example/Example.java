package Class_Example;
class Example//class is an key word
{//start of the class body


	//instant-->with respect to time  vs instance--->copy /clone object
public static void main(String[] args)//to run code in java we should have main method
{
    Example ex = new Example();
	System.out.println(ex);//out will be null and so that it is not zero it is nullified. there should no value.
	//Example ex = new Example();//new is the key word
	/*for(int i=0; ;i++) {
		new Example();
		System.out.println(i);
	}//infinite new objects will be created.*/
}	
	
}//end of the class body
