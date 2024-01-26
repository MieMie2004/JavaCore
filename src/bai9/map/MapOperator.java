package bai9.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapOperator {
    public static void main(String[] args) {
//        1.map
//        2.triển khai maao -> HashMap , TreeMap , LinkedMap
        Map<Integer, String> fruits= new HashMap<>();
//        add
        fruits.put(1, "apple");
        fruits.put(2,"banana");
        fruits.put(3 ,"orange");
        fruits.put(4, "cherry");
        fruits.put(5,"lemon");

//        print-> print key -> value
        System.out.println(fruits);
//        print only values

        Collection<String> values = fruits.values();
        for (String fruit : values){
            System.out.println(fruit);
        }
//        print only keys

        Set<Integer> keyfruits = fruits.keySet();
        for (Integer key : keyfruits){
            System.out.println(key);
        }
//get value by key
        String apple = fruits.get(1);
        System.out.println(apple);
//        neu khong tai key trỏng map, return null
        System.out.println(fruits.get(6));

//         update  value by key

        fruits.put(2, "orange_update");
        fruits.replace(3, "Banana_update");
        System.out.println("-----------------fruits after update-----------");
        System.out.println(fruits);

//        remove
        fruits.remove(5);
        System.out.println("------------fruits after remover------------");
        System.out.println(fruits);

//        size
        System.out.println("size of map :" +fruits.size());
//        check key exits in map
        boolean containsKeyBanana = fruits.containsKey(3);
        System.out.println(containsKeyBanana);

        boolean containsKeyNotExist = fruits.containsKey(6);
        System.out.println(containsKeyNotExist);

//        check values exits in map

        System.out.println(fruits);
        boolean containsValueCherry = fruits.containsValue("cherry");
        System.out.println("containsValueCherry :"+containsValueCherry);

        boolean containValueNoExits= fruits.containsValue("tomato");
        System.out.println("containsKeyNotExist:"+containValueNoExits);




//        clear
        fruits.clear();
        System.out.println("size of after clear"+fruits.size());


     }
}
