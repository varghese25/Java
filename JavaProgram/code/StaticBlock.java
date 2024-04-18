public class StaticBlock
{
	public StaticBlock()
	{
		System.out.println("Hello From Construstor");
	}
	{
		System.out.println("Hello from no static block");
	}
	
	{
		System.out.println("Hello from no static block 2");
	}
	
	static
	{
		System.out.println("Hello from static block 2");
	}
	static
	{
		System.out.println("Hello from static block ");
	}
	// **** NOTES ****
	// Static - Prerequisites
	// block - small set of instructions
	// method - set of instrction
	// Block JDK give prefernce for exection
public static void main(String[] args)
{
	//StaticBlock sb1 = new StaticBlock();
System.out.println("Hello from main (Static) method");
StaticBlock sb1 = new StaticBlock();
StaticBlock sb2 = new StaticBlock();
StaticBlock.test();
}

public static void test()
{
	System.out.println("Static method test");
}
}