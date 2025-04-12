package Class_Example;

public class Home {

	
		//Instance/local/class variables
		/*
		 * instance---declared within class body--access this variable through out of the class
		 * local----declared within method---access this variable within the method only.
		 * 
		 * 
		 */
		int i =123;//instance variables/Global variable
		static int l = 10;//class variable
		public void go(){
			i = 898;
			int j =234;//local variable
		}
		
		public void show() {
			i = 345;
			//j =345--cannot change.
		}

	

}
