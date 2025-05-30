class Static
{
  static int age;
}

class StaticMain
{
    public static void main(String arg[])
	{
	Static s=new Static();
	Static s2=new Static();
	s.age=21;
	s2.age=22;
	Static.age=23;
	System.out.println("s age:"+s.age);
	System.out.println("s2 age"+s2.age	);
	}

}