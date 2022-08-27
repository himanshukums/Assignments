package Assignments;

public class thisMethod {
	public void method1()
	{this.method5();
		System.out.println("Default Method");
	}
	public void method2()
	{
		System.out.println("First Method");
	}
	public void method5()
	{this.method2();
		System.out.println("Another Method");
	}

	public static void main(String[] args) {
		thisMethod obj=new thisMethod();
		obj.method1();
	}
}
