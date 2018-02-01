class A
{
	int value;
}
class B extends A
{
	int value;
	void show()
	{
		System.out.println("\n The Value : " + value + " Parent Value : " 
			+ super.value );
	}
}
class UseAB
{
	public static void main(String[] args)
	{
		B obj = new B();
		obj.value  = 12323;
		obj.show();
		A ob = obj;
		System.out.println("\n A value : " + ob.value );
		ob = new A();
		if( ob instanceof B );
		
	} 
 }
