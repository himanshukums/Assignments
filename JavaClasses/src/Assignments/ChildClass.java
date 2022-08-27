package Assignments;

public class ChildClass extends ParentClass {
	public ChildClass() {
		super(12,16);
		System.out.println("Child Default");
	}
	public ChildClass(int a)
	{this();
		System.out.println("Child One");
	}
	public ChildClass(int a,int b)
	{ this(12);
		System.out.println("Child two");
	}
	public static void main(String[] args) {
		ChildClass obj=new ChildClass(12,16);
	}

}
