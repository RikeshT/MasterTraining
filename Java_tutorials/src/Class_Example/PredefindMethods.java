package Class_Example;

public class PredefindMethods {
   // static int num_1;
	public static void main(String[] args) {
		double num = Math.random()*1000;//random method returns double value
		System.out.println(num);
		//Without floating point 
		//Type cast----->this is will return the shorter value
		int num_1 = (int)Math.random()*1000;//default of int is zero and return zero
		int num_2 = (int)(Math.random()*1000);//using BODMAS rule return value
		System.out.println(num_1);
		System.out.println(num_2);

	}

}
