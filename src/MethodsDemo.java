
public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodsDemo d = new MethodsDemo();
		String name = d.getData();
		System.out.println(name);
		MethodsDemo2 d2 = new MethodsDemo2();
		d2.getUserData();
		getData2();
	}
	
	public String getData ()
	{
		System.out.println("hello world");
		return "str name";
	}

	public static String getData2 ()
	{
		System.out.println("hello world");
		return "str name";
	}
}
