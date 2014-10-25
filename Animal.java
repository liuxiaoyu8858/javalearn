class Animal
{
	Animal()
	{
	//	System.out.println("Animal construct");	
	}
	void eat()
	{
		System.out.println("animal eat");
	}
	void sleep()
	{
		System.out.println("animal sleep");
	}
	void breath()
	{
		System.out.println("animal breath");
	}
}
class Fish extends Animal
{
	Fish()
	{	
	//	System.out.println("fish construct");
	}
	void breath()
	{
		//super.breath();	
		System.out.println("fish bubble");
	}
}
class Integeration
{   
	static void fun(Animal an)
	{
		an.breath();
	}
	public static void main(String[] args)
	{
/*	Animal a=new Animal();
	Fish f= new Fish();
	a.breath();
	f.breath();	*/
	Fish f= new Fish();
	Animal an;
	an = f;
	fun(an);
	if (an instanceof Fish)
	{System.out.println("an is fish");}
	else
	{System.out.println("an is animal");}
   }
}