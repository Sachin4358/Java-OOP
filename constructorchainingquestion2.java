class AA{
	String x;
	static int y;
	void show() {
		
	}
	AA(){
		System.out.println("Hello AA");
		x="Ram";
		y++;
		
	}
	static {
		System.out.println("Hi AA");
	}
}
public class constructorchainingquestion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(AA.y);
		AA a1 = new AA();
		AA a2= new AA();
		a1.show();
		a2.show();
		

	}

}
