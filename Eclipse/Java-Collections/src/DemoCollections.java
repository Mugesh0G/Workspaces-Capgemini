import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.stream.Stream;

public class DemoCollections {

	public static void main(String[] args) {

		Products door = new Products("teak door", 11);
		Products panel = new Products("ePVC", 30);
		Products window = new Products("Pvc window", 30);
		

		Collection<Products> products = new ArrayList<>();
		products.add(panel);
		products.add(window);
		products.add(door);
		
	
		

		Iterator<Products> iterator = products.iterator();
		while (iterator.hasNext()) {
			Products product1 = iterator.next();
			if (product1.getWeight() <= 10) {
				iterator.remove();
			}
			else {
				
				System.out.printf(products+" "+product1.getName()+" "+product1.getWeight()+"\n");
//				Products@515f550a
//				Products@cac736f
			}
			
		}
		for(Products prod:products) {
			Products product = prod;
		
		}
		
		

	}

}
