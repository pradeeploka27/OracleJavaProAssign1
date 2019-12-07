
public class Test2 {
int x=2,y=3,z=4;
void calculate()
{
	x++;
	y++;
	z++;
	++x;
}
void display()
{
	System.out.println(x);
	System.out.println(y);
	System.out.println(z);
	
}
void print()
{
	System.out.println("pradeep");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test2 t=new Test2();
t.calculate();
t.display();
t.print();
	}

}
