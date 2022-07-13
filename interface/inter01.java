interface Dummy
{
	static void show()
	{
		System.out.println("dummy class show is running");
	}
} 
interface Dummy2
{
	void show();
}

interface Demo
{
	static void show()
	{
	System.out.println("Demo class show is running");
	}
	
 	public static void main(String[]args)
	{
	System.out.println("main is running");
	Dummy.show();
	Demo.show();
	
	}
}

class Demo2 implements Dummy2,Demo
{
	public void show()
	{
	System.out.println("Dummy2 class show is running");	
	}

	public static void main(String[]args){
	System.out.println("main Demo2 is running");
	Dummy2 s= new Demo2();	
	s.show();
	}
}

