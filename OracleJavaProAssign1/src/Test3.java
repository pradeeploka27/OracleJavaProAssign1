
public class Test3 {
	int a=2,b=5,c=7;
void print()
{
	System.out.println("hi");
	
}
void large()
{
	if(a>b&&a>c)
	{
		System.out.println("a is larger");
	}
	else if(b>a&&b>c)
	{
		System.out.println("b is larger");
		
	}
	else
	{
		System.out.println("c is larger");
	}
}
void display()
{
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test3 t=new Test3();
t.print();
t.large();
t.display();
	}

}
