package Bai_tap;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainProduct {
    public static void main(String[] args) {
        MainProduct mainProduct = new MainProduct();

        List<Product> products = mainProduct.addProductlist();
         mainProduct.ShowProduct(products);
         mainProduct.ProductUpdate(products);
         mainProduct.DeleteProduct(products);
        List<Product> exitbyName = mainProduct.SearchName(products );
        mainProduct.sortProductByPriceDesending(products);
        mainProduct.showProductWhichHasAvailableTrue(products);
//        8.
        products.clear();
        System.out.println("--SIZE OF PRODUCT LIST AFTER CLEAR---: " + products.size());

    }





    private List<Product> addProductlist() {


        List<Product> products = new ArrayList<>();
        Product product0 = new Product(1, "product A", "A", 555, true);
        Product product1 = new Product(2, "product B", "B", 666, true);
        Product product2 = new Product(3, " product C ", "C", 777, false);
        Product product3 = new Product(4, "product D", "D ", 9999, false);
        Product product4 = new Product(5, "product E", "B", 5846, true);
        Product product5 = new Product(6, "product F", "F", 414, false);
        Product product6 = new Product(7, "product G", "G", 8286, true);
        Product product7 = new Product(8, "product I", "B", 8243, false);
        Product product8 = new Product(9, "product H", "H", 635, true);
        Product product9 = new Product(10, "product M", "M", 951, false);


//        add Product
        products.add(product0);
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);
        products.add(product7);
        products.add(product8);
        products.add(product9);

        return products;
    }

    private void ShowProduct(List<Product> products) {
//        2.  show sp
        System.out.println("------------- Show Product--------");
        for (Product product : products) {
            product.productList();
        }

    }

//    3. update
    private  void ProductUpdate(List<Product>products){
        System.out.println("------------ProductUpdate---------");
        for (Product product: products){
            if (product.getCategoryProduct().equals("B")){
                product.setProductName(product.getProductName().concat("_Update"));
                product.setProductPrice(product.getProductPrice()+100f);
                product.setAvailable(!product.isAvailable());

            }

        } for (Product product : products) {
            product.productList();}


    }
    //4 . xoa false và gia <1000

    private  void DeleteProduct(List<Product>products){
        System.out.println("-------------DeleteProduct-------");
        List<Product> deleteProduct= new ArrayList<>();
        for (Product product: products){
            if (!product.isAvailable()&&product.getProductPrice()<1000){
                deleteProduct.add(product);
            }
        }
        products.removeAll(deleteProduct);
        System.out.println("size of product after delete : " +products.size());


    }
//    5
    private  List<Product> SearchName(List<Product>products){
        System.out.println("-------Search Product By Name----------");
        List<Product> existProductByName= new ArrayList<>();
        for (Product product: products){
            if (product.getProductName().contains("A")){
                existProductByName.add(product);
            }
        }
        for (Product product : products) {
            product.productList();}
        return products;

    }
//    sx theo gia giam  dan
    private  void sortProductByPriceDesending(List<Product>products){
        products.sort(Comparator.comparing(Product::getProductPrice).reversed());
        System.out.println("--PRODUCT AFTER SORT BY PRICE DESCENDING--");
        for (Product product : products) {
            product.productList();
        }
    }
//    7.  hiểm thị những sp con hàn - available-- true

    private void showProductWhichHasAvailableTrue(List<Product>products){
        for (Product product : products) {
            if (product.isAvailable()) {
                product.productList();
            }
        }
    }



}


