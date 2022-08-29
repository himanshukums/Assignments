package Assignments;

public class Encapsulationclass 
{
private String color;
private int Roll;
{
	
}
public String getcolor()
{
	return color;
}
public void setcolor(String color)
{
	this.color=color;
}
public int getRoll()
{
	return Roll;
}
public void setRoll(int Roll)
{
	this.Roll=Roll;
}
public static void main(String[] args) {
	Encapsulationclass s=new Encapsulationclass();
	s.setcolor("Red");
	System.out.println(s.getcolor());
	s.setRoll(1);
	System.out.println(s.getRoll());
}
}
