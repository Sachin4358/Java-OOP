class My{
	static int x = 10;
	String y;
	void show( ) {
		System.out.println(x+" "+y    );
	}
	My(){
		System.out.println("Hi");
		x=15;
		
	}
	My(String a, int b){
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
public class OOPSQuest1 {

	public static void main(String[] args) {
		System.out.println(My.x);
		My m1 = new My();
		My m2 = new My("Rahul",12);
		m1.show();
		m2.show();
		
		// TODO Auto-generated method stub

	}

}
