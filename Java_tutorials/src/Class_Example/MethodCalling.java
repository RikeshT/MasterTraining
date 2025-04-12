package Class_Example;

public class MethodCalling {
//static component--->cannot give a call to non-static component 
//static component--->can give a call to static component 
//non static component--->can give a call to non-static/static component 
//Non static components cannot be called without maling object of class.
//why we are not keeping static for all methods ---because of oo(object oriented programming)--OOPS	
/*
 * writing the code--
 * compile the code--
 * Executed---give a call to JVM---JVM will looks first to the main method
 * If we remove the static keyword in main method there will be no error in compilation
 * But when we execute and jvm not find the main method and it will throw error says 
 * "Main method is not static in class Methodcalling"
 * 
 * 
 * 
 * 
 * 
 */





	public static void main(String[] args) {
		MethodCalling m = new MethodCalling();
		m.go();
		go3();

		// go()--->error(create an objaect)--main menthod is static method

	}
	public static void go3() {
		System.out.println("Inside go3 menthod");
	}

	public void go() {
		System.out.println("Inside go menthod");
		go1();// no error because go() menthod is non static
	}

	public void go1() {
		System.out.println("Inside go1 menthod");
		go2();// no error because go1() menthod is non static
		go3();
	}

	public void go2() {
		System.out.println("Inside go2 menthod");
	}

}
