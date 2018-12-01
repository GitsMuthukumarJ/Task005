package DimentionalArray;


public class JavaOneDimArray {

	public static void main(String[] args)
	{
		/* int a0=50;
		 * int a1=20;
		 * int a2=35;
		 * int a3=40;
		 * int a4=60;
		 * int a5=80;
		 * int a6=70;
		 * inta7=100;
		 */

int[]a= {50,20,35,40,60,80,70,100};

System.out.println(a[2]+" "+a[6]);
System.out.println("------------------");

for(int temp : a)
{
	System.out.println(temp);
}
System.out.println("------------------");

int[]x=new int[4];
x[2]=15;
x[0]=30;

for(int temp2 : x)
{
	
	System.out.println(temp2);
}
}
}
