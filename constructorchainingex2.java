class vehicle{
	String name;
	int age;
	void show() {
		System.out.println(name+" "+age);
	}
	vehicle(String  n , int a ){
		this ("Audi A4");
		System.out.println("Hello vehicle");
		name= n;
		age = a;
		
	}
	vehicle(String n){
		this();
		System.out.println("ok vehicle");
		name= n;
		
		
	}
	vehicle(){
		System.out.println("Hi vehicle ");
	}
}
public class constructorchainingex2 {

	public static void main(String[] args) {
		vehicle v = new vehicle("BMW X1") ;
		v.show();
		
			
		}
		// TODO Auto-generated method stub

	}


