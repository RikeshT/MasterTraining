package Example_1;

public class Calculator {
	/*
	 * ClassNmae- TheDarkNight methodName-theDarkNIght
	 */

	public Calculator() {
		// method having the same name as class name is called as constructor
		System.out.println("calling a constructor");
	}

	public void add() {
		System.out.println("adding the numbers");
	}

	public void subtract() {
		System.out.println("subtract the numbers");
	}

	public void mul() {
		System.out.println("mult the numbers");
	}

	public void div() {
		System.out.println("dividing the numbers");
	}

	public static void main(String[] args) {
		// all the highlighted words are static keywords
		// objects are called as classes in java, so called as superclass.
		// Calculator calc;{calc is not an object}
		// new Calculator();{it will create the object. calc is the reference variable
		// where it will store the address of object.}
		// new Calculator().add();{output is calling a constructor and adding the
		// number.
		// String is also called as internal class in java. It is the data type.
		Calculator calc = new Calculator();
		calc.add();
		calc.subtract();

		/*
		 * constructor is not called as how method is called. So constructor is called
		 * whenever the object is created
		 */

	}

}
