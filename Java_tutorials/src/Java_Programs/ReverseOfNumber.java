package Java_Programs;

public class ReverseOfNumber {

	public static void main(String[] args) {
		int reverse = 0;
		int n = 1234;
		for(; n!=0; ) {
		reverse = reverse*10+n%10;
		n = n/10;
		
		
		
		

	}
		System.out.print(reverse);
	}

}
