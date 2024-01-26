package bai9;

import java.util.ArrayList;
import java.util.List;

public class OperatorBai9 {
    public static void main(String[] args) {
//        Create new list String( products)
//        1. add element into the lít ( samsung , iphone , nokia, oppo, vivo)
//        2. print all products in list products;
//        3. update samsung--> samsung_update;
//        4. add element between iphone and nokia (asus);
//        5. remove oppo in product list;
//        6. clear all list product;
//1.
        List<String> products= new ArrayList<>();
        products.add("SamSung");
        products.add("Iphone");
        products.add("Nokia");
        products.add("Oppo");
        products.add("Vivo");
//        2.
        for (String item :products){
            System.out.println(item);
        }
//        3.
        System.out.println("------- show update----------");
        products.set( 0, "Samsung_update");
        products.forEach(item->{
                    System.out.println(item);
                });
//        4.
        products.add(2, "Asus" );
        System.out.println("-----add product--------");
        products.forEach(item->{
            System.out.println( item );
        });
//        5.
        products.remove(3);
        System.out.println("----------remove----------");
        products.forEach(item-> {
            System.out.println(item);
        });
//        6
        products.clear();
        System.out.println("----products after clear:");
        System.out.println("size of list :" +products.size());


    }
}
