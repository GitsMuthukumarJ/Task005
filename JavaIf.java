public class JavaIf {

	public static void main(String[] args) {
			int a=10;
			int b=25;
			int c=40;
			//Assigned integer values;
		if(a>b) {
			System.out.println("a is greater than b");
		}
		if(b>c) {
			System.out.println("b is greater than c");
		}
		if(a<c) {
			System.out.println("a is less than c");
		}
		//This statement also correct;
		{
			System.out.println();
		}
		if(c>a) {
			System.out.println("c is greater than a");
		}
	}	

}
