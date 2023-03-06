
public class RaceCondition {

	public static void main(String[] args) throws  Exception{
		// TODO Auto-generated method stub
		 LongWrapper longWrapper = new LongWrapper(0L);
		 
	        Runnable r =()->{
	          for (int i=0;i<1000;i++){
	              longWrapper.incrementValue();
	          }
	        };
	        Thread t = new Thread(r);
	        t.start();
	        t.join();

	        System.out.println("value= "+longWrapper.getValue());

	}

}
