package bai9;

import java.util.LinkedList;
import java.util.List;

public class MainLinkedList {
    public static void main(String[] args) {
//        LinkedList ---> triền khai của list
//        add , get , set , remove , clear , size , ccontainingOf , indexOf , lastIndexOf
        List<String> products = new LinkedList<>();
        products.add("apple");
        products.add("nokia");
        products.add("samsung");


        String nokia= products.get(1);
        System.out.println("nokia"+nokia);

        products.forEach(product-> {
            System.out.println(product);
        });

        products.set(2 , "samsungUpdate");
        System.out.println("----Product update----");
        products.forEach(product-> {
            System.out.println(product);
        });

        products.remove("nokia");
        System.out.println("---remove nokia---");
        products.forEach(product-> {
            System.out.println(product);
        });

        int size = products.size();
        System.out.println("size of product:"+size);

        int samsungUpdate = products.indexOf(" samsungUpdate");
        System.out.println("indexof Samsung:" +samsungUpdate);

        boolean apple = products.contains("Apple");
        System.out.println("apple in list:" +apple);

        products.add("Samsung_update");
        products.add("Samsung_update");
        products.add("Samsung_update");

        System.out.println("Product afterSamsung_update");
        products.forEach(product->{
            System.out.println(product);
        });


        int samsungupdate1= products.indexOf("Samsung_update");
        System.out.println("index of samsung :" + samsungupdate1);
        int lastIndexOfSamsung_update= products.lastIndexOf("Samsung_update");
        System.out.println("index of lastIndexOfSamsung_update:" +samsungupdate1);
    }
}
