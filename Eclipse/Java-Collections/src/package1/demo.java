package package1;


abstract class money{
	abstract void buy();
}

class dress extends money{

	@Override
	void buy() {
		// TODO Auto-generated method stub
		System.out.println("jeans");
	}
}
class vehicle extends money{

	@Override
	void buy() {
		// TODO Auto-generated method stub
		System.out.println("pulsar-150");
	}	
}
class alcohol{
	
}
class juice extends money{

	@Override
	void buy() {
		// TODO Auto-generated method stub
		System.out.println("mango-juice");
	}
	
}

public class demo{
	
	//non access modifiers : final, default, abstract,static.
	int num = 0;
	
	public static void main(String[] args) {
		System.out.println("Hello world");
		num = 20;
//		 int number = 10;
//		System.out.println(number);
//		number = 25;
//		System.out.println(number);
		demo demo = new demo();
//		demo.num = 15;
		System.out.println(demo.num);
		
		demo demo2 = new demo();
		System.out.println(demo2.num);
		
		
	}
	
}
