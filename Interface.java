interface Language
{
	void greet();
}
class Hindi implements Language
{
	public void greet()
	{
		System.out.println("Suprabhat!");
	}
}
class English implements Language
{
	public void greet()
	{
		System.out.println("Good Morning!");
	}
}
class French implements Language
{
	public void greet()
	{
		System.out.println("Bonjour!");
	}
}
class UseLanguage
{
	public static void main(String [] args)
	{
		Language lg;
		lg= new Hindi();
		lg.greet();
		lg = new English();
		lg.greet();
		lg= new French();
		lg.greet();
	}
}
