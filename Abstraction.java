package Abstraction;

abstract class Abstraction
{

	abstract void run();
	void print()
	{
		System.out.println("Hello");
	}
}
class Abstraction1 extends Abstraction
{
	void run()
	{
		System.out.println("Hai i am running");
	}
	public static void main(String[] args) 
	{
		Abstraction1 obj=new Abstraction1();
		obj.run();
		obj.print();
	}
}