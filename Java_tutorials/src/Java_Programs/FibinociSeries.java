package Java_Programs;

public class FibinociSeries {

	public static void main(String[] args) {
		int first = 0, second = 1;
		System.out.print("Fibonocci series:" +first+","+second);
		int n =10;
		for(int i =0; i<10; i++) {
			int next = first+second;
		   System.out.print(","+next);
		   first = second;
		   second = next;
		}
		for(int i =0; i<10; i++) {
			int next = first+second;
		   System.out.print(","+next);
		   first = second;
		   second = next;
		}
		for(int i =0; i<10; i++) {
			int next = first+second;
		   System.out.print(","+next);
		   first = second;
		   second = next;
		}

	}

}
