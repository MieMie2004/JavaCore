package Text_java;

import Finail_Score_Demo.UseException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class MainProduct {
    public static void main(String[] args) {
        MainProduct mainProduct = new MainProduct();

//        Lưu ý: Với mỗi yêu cầu tạo ra 1 function riêng. Không phải để toàn bộ trong hàm main
//
//        1. Tạo một đối tượng Product bao gồm những thông tin sau
//
//· productId → int ( ma san pham )
//
//· productName → String ( ten san pham )
//
//· productPrice → float ( gia san pham )
//
//· available → boolean ( tinh trang san pham )
//
//· saleDate → Date ( ngay ban )
//
//· Tạo constructor không có tham số
//
//· Tạo constructor có 5 tham số tương ứng (productId, productName, productPrice, available, saleDate) truyền vào
//
//· Tạo method getter và setter
//
//· Tạo method displayInformationProduct → hiển thị thông tin product
//
//        2. Cho phép nhập vào sản phẩm từ người dùng và validation ( Xây dựng được exception bắt riêng cho từng lỗi ở dưới ) nhập 5 sản phẩm
//
//        1. productId
//
//· productId chỉ được nhập vào là số ( nếu bị lỗi in ra productId must be number )
//
//· productId có length bằng 6 kí tự ( nếu bị lỗi in ra productId have maximum length 6)
//
//· productId không được trùng lặp trong danh sách product ( nếu bị lỗi in ra productId not duplicate)
        System.out.println("---------Giải----------");
        List<Product> products= new ArrayList<>();
        Scanner a = new Scanner(System.in);
        for (int i= 0; i<5;i++) {
            int productId = 0;
            boolean ID = true;
            do {
                System.out.println("ProductId");
                try {
                    productId = a.nextInt();
                    String idString = String.valueOf(productId);

                    if (idString.length() > 6) {
                        throw new UserEx("ID length cannot exceed 6 characters");
                    }

                    for (Product item : products) {
                        if (item.getProductId() == productId) {
                            throw new UserEx("");
                        }
                    }
                    ID = false;
                } catch (UserEx ex) {
                    System.out.println(ex.getMessage());

                } catch (InputMismatchException ex) {
                    System.out.println("productId must be number");
                    a.nextLine();
                } catch (DuplicateFormatFlagsException ex) {
                    System.out.println("productId not duplicate");
                }
            } while (ID);
//                System.out.println("ProductId:");
            a.nextLine();
//        2. productName: productName không được là chuỗi rỗng ( nếu bị lỗi in ra productName cannot be empty )

            String productName = null;
            boolean checkProductName = true;

            do {
                System.out.println("productName");
                try {
                    productName = a.nextLine();
                    if (productName.isBlank()) {
                        throw new UserEx("productName cannot be empty");

                    }
                    checkProductName = false;
                } catch (UserEx ex) {
                    System.out.println("productName cannot be empty");
                }

            } while (checkProductName);
//        3. productPrice: productPrice phải lớn hơn 100 và nhỏ hơn hoặc bằng 1000 ( nếu bị lỗi in ra productPrice out of range)
            float productPrice = 0;
            boolean checkPrice = true;
            do {
                System.out.println("productPrice:");
                try {
                    productPrice = a.nextFloat();
                    if (productPrice < 100 && productPrice >= 1000) {
                        throw new UserEx("productPrice out of range");
                    }
                    checkPrice = false;
                } catch (UserEx ex) {
                    System.out.println(ex.getMessage());
                }
            } while (checkPrice);
            a.nextLine();
//        4. available: Chỉ được nhập vào là true hoac false ( nếu bị lỗi in ra available was wrong formatter)
            String available;
            boolean checka = true;
            do {
                System.out.println("Available:");
                available = a.nextLine();
                try {
                    if (!available.equals("true") && !available.equals("false")) {
                        throw new UserEx("available was wrong formatter");
                    }
                    checka = false;
                } catch (UserEx ex) {
                    System.out.println(ex.getMessage());
                }
            } while (checka);
            //        5. saleDate: saleDate đúng format (dd/MM/yyyy) nếu sai in ra lỗi saleDate was wrong formatter
            Date saleDate = null;
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            format.setLenient(false);
            boolean checkdate = true;
            do {
                System.out.println("SaleDate:");
                String date = a.nextLine();
                try {
                    saleDate = format.parse(date);
                    checkdate = false;

                } catch (ParseException e) {
                    System.out.println("saleDate was wrong formatter");
                }
            } while (checkdate);
            a.nextLine();

            Product product = new Product();
            product.setProductId(productId);
            product.setProductName(productName);
            product.setProductPrice(productPrice);
            product.setAvilable(available.equals("true") ? true : false);
            product.setSaleDate(saleDate);
            products.add(product);
        }

            //        3. Hiển thị danh sách sinh viên
            //· Theo thứ tự productId tăng dần (lưu ý: sử dụng method displayInformationProduct đã khai báo ở trên)

            System.out.println("----Show Product Infor----");
            products.sort(Comparator.comparing(Product::getProductId));
            for (Product item : products) {
                item.displayInformationProductInput();
            }
            //        4. Tìm kiếm và hiển thị danh sách product có giá rơi vào khoảng từ 300 đến 600

            System.out.println("---------ds product theo gia--------");
            for (Product item : products) {
                if (item.getProductPrice()<600&& item.getProductPrice()<300)
                item.displayInformationProductInput();
            }
            //        5. Tìm kiếm và hiển thị danh sách available là true ( lưu ý: Nếu available là true thì hiển thị là còn hàng, còn false thì hiển thị hết hàng )
            System.out.println("--------ds theo available--------------");
            for (Product item : products) {
                item.displayInformationProduct();
            }



//
//        6. Xây dựng menu cho chương trình dễ thao tác
    }
}
