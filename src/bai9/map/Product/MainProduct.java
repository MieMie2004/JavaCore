package bai9.map.Product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class MainProduct {
    public static void main(String[] args) throws ParseException {
//        Bài 2:
//        xây dựng chương trinh qua li gio hàng trong menu , neu gio hang lớn hơn  sp -> kết thúc chương trình

//        Chương trinh cho phep them sp vào trong gio hang voi thong tin người dùng nhập vào
        //        Một giỏ hàng không được có 2 sản phầm trùng nhau.

        Scanner scanner= new Scanner(System.in);
        System.out.println("-------CART MANAGEMENT------");
        Map < Integer,Product> products= new HashMap<>();
        MainProduct mainProduct= new MainProduct();



        for (int i= 1; i<=2; i++){
            System.out.println("---------ADD PRODUCT TO CART-------");
            System.out.println("productId:");
            int productId= scanner.nextInt();
            scanner.nextLine();

            Product product= mainProduct.createProduct(productId);
            products.put(productId,product);

        }
//        2 show toan bo thong tin sp trong gio hang, sản phẩm được sắp xếp giảm dần theo giá.
       mainProduct.showProduct(products);
//         3. update thong tin gio hang theo id sp tu nguoi dung nhap vao

        System.out.println("-------Product After Update-------");
        System.out.println("productIdUpdate:" );
        int productIdUpdate = scanner.nextInt();
        boolean containsKey= products.containsKey(productIdUpdate);
        if (containsKey){
            Product productUpdate = mainProduct.createProduct(productIdUpdate);
            products.replace(productIdUpdate,productUpdate);


            System.out.println("--PRODUCT AFTER UPDATED--");
           mainProduct.showProduct(products);
        } else {
            System.out.println("THERE IS NO PRODUCT IN THE CART");
        }
//        4. delete tt sp voi id do ng dung nhap vao
        System.out.println("-----PRODUCT AFTER DELETE--------");
        int productDelete =  scanner.nextInt();
        boolean productRemove = products.containsKey(productDelete);
        if (productRemove){
            products.remove(productDelete);
            System.out.println("PRODUCT AFTER UPDATED"+products.size());
        }
        else {
            System.out.println("THERE IS NO PRODUCT IN THE CART");
        }

        //        5. tìm kím thong tin với id do ng dùng nhập vao

        System.out.println("----Search Product----");

        int productIdSearch = scanner.nextInt();
        boolean checkIdSearch = products.containsKey(productIdSearch);
        if (checkIdSearch){
           Product a=  products.get(productIdSearch);
            a.displayProduct();
        }else {
            System.out.println("THERE IS NO PRODUCT IN THE CART");
        }
//        6 xoa gỏ hàng
        products.clear();
        System.out.println("size of after clear"+products.size());

    }
    private void showProduct(Map < Integer,Product> products){
        List<Product> productsAfterSort = products.values().stream().collect(Collectors.toList());
        productsAfterSort.sort(Comparator.comparingDouble(Product::getProductPrice).reversed());
        for (Product product:productsAfterSort){
            product.displayProduct();
        }

    }
    private Product createProduct( int productId) throws ParseException{
        Scanner scanner= new Scanner(System.in);

        System.out.println(" productName:");
        String productName = scanner.nextLine();

        System.out.println(" productYear");
        String productYear = scanner.nextLine();

        System.out.println(" productPrice :");
        double productPrice = scanner.nextDouble();

        Product product = new Product();
        product.setProductID(productId);
        product.setProductName(productName);
        product.setProductPrice(productPrice);

        SimpleDateFormat pattern = new SimpleDateFormat("yyyy/mm/dd");
        Date dateParse= pattern.parse(productYear);
        product.setProductYear(dateParse);
        return product;


    }




}
