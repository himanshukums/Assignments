package Assignments;

public class ParentClass {
	public ParentClass() {
		this(12);
		System.out.println("Parent Default");
	}
	public ParentClass(int a)
	{
		System.out.println("Parent One");
	}
	public ParentClass(int a,int b)
	{this();
		System.out.println("Parent two");
	}
}
