package bai9;

import java.util.ArrayList;
import java.util.List;

public class MainArrayList {
    public static void main(String[] args) {
//        1. ArrayList
//        2 linkedList
        List<Integer> numbers = new ArrayList<>();

//        add phan tu vao trong list
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
//        hien thi toan bo phan tu trong list
        for (Integer item : numbers){
            System.out.println(item);
        }
//        hien thi 1 phan tu chi dinh trong líst
        System.out.println("number :" + numbers.get(1));
//        update phan tu trong 1 list
        numbers.set(1, 6);
        System.out.println("--------Number after changed-----");
        for (Integer item : numbers){
            System.out.println(item);
        }
//        chen 1 phan tu trong list
        numbers.add(1, 10);
        System.out.println("-------------number after update---------");
        numbers.forEach(item ->{
            System.out.println("item changed :" + item);
        });
//        lay size ò líst
        System.out.println("size of list :" +numbers.size());
//        xoa phan tu cua list
        numbers.remove(3);
        System.out.println("--------Number after remove----");
        numbers.forEach(item ->{
            System.out.println("item remove :" + item);
        });

//         lay xem gia tri do dang là phần tử index thứ mấy
        int indexOfNumber = numbers.indexOf(10);
        System.out.println("indexOfNumbers :" +indexOfNumber);
//         khi màdđưa 1 số mâ k có trong list thì sẽ trả về số âm

//        chek item tồn tại trong list
        boolean contains = numbers.contains(11);
        System.out.println("exits 10 in list:" + contains);

//        add toan bo vao trong 1 list
        List<Integer> listOrtherAdd = new ArrayList<>();
        listOrtherAdd.add(222);
        listOrtherAdd.add(555);
        listOrtherAdd.add(99);
        numbers.addAll(listOrtherAdd);
        System.out.println("----Number after add all index-------");
        numbers.forEach(x -> {
            System.out.println(x);
        });

        List<Integer> listOrtherAdd2= new ArrayList<>();
        listOrtherAdd2.add(100);
        listOrtherAdd2.add(90);
        numbers.addAll(3, listOrtherAdd2);
        System.out.println("-----Number after add all index--:");
        numbers.forEach(a-> {
            System.out.println(a);
        });

//        clear item of list
        numbers.clear();
        System.out.println("----number after clear:");
        System.out.println("size of list :" +numbers.size());

    }
}
