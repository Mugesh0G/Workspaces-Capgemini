package infosys;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
abstract class abstractClass
{
	static String method1(){
		return "Konichiwa";
	}
	
}
interface inter
{
	void hello();
	void hai();
}

class Names extends abstractClass implements inter
{
	String name;
	
	static void setName(String name)
	{
		name = name;
	}
	
	protected void finalize()
	{
		try {
			super.finalize();
			System.out.println("------------hello");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hai() {
		// TODO Auto-generated method stub
		
	}
}
public class Garbage {
	
   static int addNumbers(List<Integer>list)
  {
	 return list.stream().mapToInt(Integer::intValue)
		.sum();
  }

	public static void main(String[] args) {
		
		Supplier<String>string = Names::method1;
		System.out.println(string.get());
		
		ArrayList<String>array = new ArrayList<String>();
		array.add("mugesh");
		array.add("karthi");
		array.add("deena");
		array.add("subu");
		
		
//		
//		array.stream()
//		.filter(s->s.contains("u"));
		
		
		//		
//		array.stream().anyMatch(name->name.equals("mugesh"));
		
		HashMap<Integer, String> employee = new HashMap<>();
		employee.put(1, "Mugesh");
		employee.put(3, "Subu");
		employee.put(4, "Sithin");
		employee.put(2, "ArunGK");
		employee.putIfAbsent(5, "Saravanan");
//		
//		employee.entrySet().stream()
//		.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
//		.forEach(System.out::println);


//		for(Map.Entry m : employee.entrySet())
//		{
//			System.out.println(m.getKey()+""+m.getValue());
//		}
//		
//		
//		Predicate<Integer>hello = a -> a>10;
//		System.out.println(hello.test(9));
//		
//		Consumer<String> returnOnlyInputs = array::add;
//		returnOnlyInputs.accept("hello");
//		System.out.println(array);
		
//		
		ArrayList<Integer>arrayList = new ArrayList<>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		int temp = arrayList.get(0);
		arrayList.remove(0);
		arrayList.add(0,arrayList.get(arrayList.size()-1));
		arrayList.add(arrayList.size()-1, temp);
		arrayList.remove(arrayList.size()-1);
		
		System.out.println("-------------------"+arrayList.size());
		
		arrayList.stream()
		.forEach(System.out::println);
		
		
		
		int array1[] = new int[] {1,2,3,4,5};
		int array2[] = new int[] {1,2,3,4,5};
		int arr[] = new int[array1.length+array2.length];
		int j = 0;
		for(int i = 0;i<arr.length;i++)
		{
			if(i<array2.length) {
			arr[i] = array2[i];
			}else if(j<array1.length)
			{
				arr[i] = array1[j];
				j++;
			}
		}
		Arrays.sort(arr);
		
		Arrays.stream(arr)
		.forEach(System.out::println);
		
		
//		Function<List<Integer>,Integer>addFunction = Garbage::addNumbers;
//		System.out.println(addFunction.apply(arrayList));
//		
//		BiFunction<Integer,Integer,String> bi = (a,b)->
//		{
//			System.out.println(a+b);
//			return "Success";
//		};
//		System.out.println(bi.apply(10,1));
////		
//		Optional<Integer>op = Optional.ofNullable(12);
//		var dad = op.isPresent()?true:false;
//		System.out.println(dad);
//		
//		int arr[] = new int[10];
//	
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i] = i+1;
//			
//		}
//		int j=arr.length-1;
//		int half = Math.round(arr.length/2);
//		for(int i=0;i<half;i++)
//		{
			
//				if(arr[j]<arr[i])
//				{
//					int temp = arr[i];
//					arr[i]= arr[j];
//					arr[j]=temp;
//					
//				}
//				int temp = arr[j];
//				arr[j]= arr[i];
//				arr[i]=temp;
//				j -=1;
//			
//		}
//		Arrays.sort(arr);
//		var x = Arrays.stream(arr);
//	
//		
//		System.out.println("----------------------");
//		
//		
//		for(int i : arr)
//		{
//			System.out.println(i);
//		}

//		Names object1 = new Names();
//		Names object2 = new Names();
//		object1.setName("mugesh");
//		object2 = object1;
//		object1 = null;
//		System.out.println(object2.name);
//		System.gc();
//		System.out.println(object1.name);
	}
}
