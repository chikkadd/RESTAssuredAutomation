package tests;

public class BuilderPattern {
	
	public BuilderPattern M1()
	{
		System.out.println("INside M1 method");
		return this;
	}
	public BuilderPattern M2(String s1)
	{
		System.out.println("INside M2 method " +s1);
		return this;
	}
	public BuilderPattern M3()
	{
		System.out.println("INside M2 method");
		return this;
	}
	
	public static void main(String[] args) {
		BuilderPattern p1=new BuilderPattern();
		p1.M1().M2("Testing").M3();
		
	}
}
