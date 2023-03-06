package com.lambda;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LambdaPractice01 {

    static Optional<Product>findProduct(List<Product>product, Predicate<Product>predicate){
        for(Product product1 : product){
            if(predicate.test(product1)){
                return Optional.of(product1);
            }
        }
        return Optional.empty();
    }


    interface duplicate{
        Product create(Category category,String name,BigDecimal price);
    }
    public static void main(String[] args) {
        List<Product> products = ProductData.getProducts();

       // products.sort((p1,p2)->p1.getPrice().compareTo((p2.getPrice())));
//        int count =0;
       BigDecimal priceLimit = new BigDecimal("5");
//        for(Product product : products){
//            if(product.getPrice().compareTo(product.getPrice())<2){
//                count++;
//            }
//        }
//            products.forEach(product -> {
//            if(product.getPrice().compareTo(product.getPrice())<2){
//               count++;
//           }
//        });
//        List<Product>cheapOnes = new ArrayList<>();
//        products.stream().forEach(product -> {
//            if(product.getPrice().compareTo(priceLimit)>0){
//                cheapOnes.add(product);
//            }
//        });
//        String name = "Fork";
//        findProduct(products,product -> product.getName()
//                .equals(name)).map(Product::getCategory)
//                .ifPresentOrElse((category)->System.out.println("The searched one is present in the category :"+category),()->System.out.println("The searched one is not present : "+name));

//        products.stream().map(Product::getName).forEach(System.out::println);
//        Map<Category,List<Product>> productByMap = new HashMap<>();
//        for(Product product : products){
//            Category category = product.getCategory();
//            productByMap.computeIfAbsent(category,category1 -> new ArrayList<>()).add(product);
//       }
//        productByMap.forEach((category, products1) -> {
//            System.out.println("Category : "+category);
//            products1.forEach(product->System.out.println("-"+product.getName()));
//        });
////        for(List<Product> product : productByMap.values()){
//            System.out.println(product);
//        }

//        Predicate<Product>isFood = product -> product.getCategory() == Category.FOOD;
//        Predicate<Product>isCheap = product -> product.getPrice().compareTo(priceLimit)>0;
//        findProduct(products,isFood.and(isCheap))
//                .map(product -> product.getName())
//                .ifPresentOrElse(name -> System.out.println("List of Cheapest Food is :"+name),()->System.out.println("ERROR :( "));

//        products.stream()
//                .sorted((p1,p2)-> p1.getPrice().compareTo(p2.getPrice()))
//                .filter(product -> product.getPrice().compareTo(priceLimit)<0)
//                .filter(product -> product.getCategory()==Category.FOOD)
//                .forEach(System.out::println);

//        products.stream()
//                .sorted((p1,p2)->p1.getPrice().compareTo(p2.getPrice()))
//                .filter(product -> product.getCategory()==Category.FOOD)
//                .map(product -> String.format("The price of %s is %.2f",product.getName(),product.getPrice()))
//                .forEach(System.out::println);


//        Pattern spaces = Pattern.compile("//s");
//        products.stream()
//                .flatMap(product -> spaces.splitAsStream(product.getName()))
//                .forEach(System.out::println);
//
//        Optional<Product> optionalProduct = products.stream()
//                .sorted((p1,p2)-> p1.getPrice().compareTo(p2.getPrice()))
//                .filter(product -> product.getPrice().compareTo(priceLimit)<0)
//                .filter(product -> product.getCategory()==Category.FOOD)
//                .findAny();
//        System.out.println(optionalProduct);
//
//        String categories = products.stream()
//                .map(Product::getCategory)
//                .distinct()
//                .map(Category::name)
//                .collect(Collectors.joining("-"));
//        System.out.println(categories);

//        List<Product> utensilsList = products.stream()
//                .filter(product -> product.getCategory()==Category.UTENSILS)
//                .sorted((p1,p2)->p1.getName().compareTo(p2.getName()))
//                .sorted((p1,p2)->p1.getPrice().compareTo(p2.getPrice()))
//                .collect(Collectors.toList());
//
//        utensilsList.stream()
//                .forEach(System.out::println);
//        System.out.println("--------------------------");
//
//        products.stream()
//                .filter(product -> product.getCategory()==Category.UTENSILS)
//                .sorted((p1,p2)->p1.getPrice().compareTo(p2.getPrice()))
//                .forEach(System.out::println);
//
//        System.out.println("------------------------");
//
//        Stream<UUID>uuidStream = Stream.generate(UUID::randomUUID);
//        uuidStream.limit(20).forEach(System.out::println);
//        System.out.println("------------------------");
//
//        Stream<BigInteger>bigIntegerStream = Stream.iterate(BigInteger.ONE,bigInteger -> bigInteger.multiply(BigInteger.TWO));
//        bigIntegerStream.limit(10).forEach(System.out::println);
//        System.out.println("------------------------");
//
//        Stream<Character>characterStream = Stream.iterate('A',letter->letter<='Z',letter ->(char)(letter+1));
//        characterStream.forEach(System.out::print);System.out.println();
//        System.out.println("------------------------");
//        Optional<BigDecimal>optionalBigDecimal = products.stream()
//                .map(Product::getPrice)
//                .reduce(BigDecimal::add);
//
//        optionalBigDecimal.ifPresentOrElse(total ->System.out.println("Total price of Products is:"+total),()->System.out.println("Not found :("));
//
//        BigDecimal bigDecimal = products.stream()
//                .map(Product::getPrice)
//                .reduce(BigDecimal.ZERO,BigDecimal::add);
//
//        System.out.println("Total price of products is:"+bigDecimal);
//
//        BigDecimal bigDecimal1 = products.stream()
//
//                .reduce(BigDecimal.ZERO,(result,product)->result.add(product.getPrice()),BigDecimal::add);
//
//        System.out.println("Total price of products is:"+bigDecimal1);
//
//        List<String>stringList = products.stream()
//                .reduce(new ArrayList<>(),
//                        (list,product)-> {
//                            ArrayList<String>list1 = new ArrayList<>(list);
//                            list1.add(product.getName());
//                                    return list1;
//                        },
//                        (list11,list2)->{
//                            ArrayList<String>list = new ArrayList<>(list11);
//                            list.addAll(list2);
//                            return list;
//                        });
//        stringList.forEach(System.out::println);
//        System.out.println("-------------------------");
//
//        List<String>stringList1 = products.stream().collect(ArrayList::new,(list,product)->list.add(product.getName()),ArrayList::addAll);
//        stringList1.forEach(System.out::println);
//        System.out.println("-------------------------");
//
//
//        Map<Category,BigDecimal>stringBigDecimalMap = products.stream()
//                .collect(Collectors.toMap(Product::getCategory,Product::getPrice,BigDecimal::add));
//
//        System.out.println(stringBigDecimalMap);
//        System.out.println("-------------------------");
//        Map<String,BigDecimal>stringBigDecimalMap1 = products.stream()
//                .collect(Collectors.toMap(Product::getName,Product::getPrice,BigDecimal::add));
//
//        System.out.println(stringBigDecimalMap1);
//        System.out.println("-------------------------");

//        Map<Category,List<Product>>categoryListMap = products.stream()
//                .collect(Collectors.groupingBy(Product::getCategory));
//
//        categoryListMap.forEach(((category, products1) ->{
//                System.out.println("categories: ");
//                products1.forEach(System.out::println);}));
//        System.out.println("-------------------------");
//
//        Map<Category,List<String>>categoryListMap1 = products.stream()
//                .collect(Collectors.groupingBy(Product::getCategory,Collectors.mapping(Product::getName,Collectors.toList())));
//
//        categoryListMap1.forEach(((category, products1) ->{
//            System.out.println("categories: "+category);
//            products1.forEach(System.out::println);}));
//
//        System.out.println("-------------------------");
//
//        Map<Category,BigDecimal>categoryBigDecimalMap = products.stream()
//                .collect(Collectors.groupingBy(Product::getCategory,Collectors.mapping(Product::getPrice,Collectors.reducing(BigDecimal.ZERO,BigDecimal::add))));
//
//        categoryBigDecimalMap.forEach(((category, products1) ->{
//            System.out.println("categories: "+category);
//            System.out.println(products1);;}));

        Map<Boolean,List<Product>>stringBigDecimalMap = products.stream()
                .collect(Collectors.partitioningBy(product->product.getPrice().compareTo(priceLimit)<0));

        stringBigDecimalMap.get(true).forEach(System.out::println);
        System.out.println("-------------------------");
        stringBigDecimalMap.get(false).forEach(System.out::println);
//        String array[] = new String[]{"one","two","three"};
//        Stream<String>stream1 = Arrays.stream(array);
//        Stream<String>stream2 = Stream.of("three");
//        Stream<String>stream3 = Stream.ofNullable("three");

//        IntStream dice = new Random().ints(1,10);
//        System.out.println(dice);
//        products.forEach(System.out::println);
//        cheapOnes.forEach(System.out::println);
//        duplicate dup = Product::new;
//        dup.create(Category.OFFICE,"charger",new BigDecimal("10"));
//        dup.create(Category.OFFICE,"charger",new BigDecimal("20"));
//        dup.create(Category.OFFICE,"charger",new BigDecimal("30"));




//        for(Product prod : cheapOnes){
//            System.out.println(prod);
//        }
    }

}
