
public class OOPS implements H1,H2 {
	
	
	
	public void hello()
	{
		Products prod = new Products();
		prod.setName("Vishnu");
		System.out.println(prod.getName());
		System.out.println("hello method");
	}
	

	public static void main(String[] args) {

		OOPS obj = new OOPS();
		obj.hello();
		obj.hello1();
		
	}


	@Override
	public void hello1() {
		// TODO Auto-generated method stub
		System.out.println("hai");
	}

}
