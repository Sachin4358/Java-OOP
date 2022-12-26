class My1{
	static int x = 10;
	String y;
	void show( ) {
		System.out.println(x+" "+y    );
	}
	My1(){
		System.out.println("Hi");
		x=15;
		
	}
	My1(String a, int b){
		this();
		System.out.println("ok");
		x=b;
		y=a;
		
	}
	static {
		System.out.println("Incapp");
	}
	{
		System.out.println("Hello");
	}
}
public class Oops1 {

	public static void main(String[] args) {
		System.out.println(My1.x);
		My1 m1 = new My1();
		My1 m2 = new My1("Rahul",12);
		m1.show();
		m2.show();
		
		// TODO Auto-generated method stub

	}

}
