package bai9.map.Product;

import java.util.Date;

public class Product {
    private int productID;
    private String productName;
    private Date productYear;
    private double productPrice;

//    public Product (int productID, String productName, Date productYear, double productPrice){
//        this.productID= productID;
//        this.productName=productName;
//        this.productPrice=productPrice;
//        this.productYear=productYear;
//    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductYear(Date productYear) {
        this.productYear = productYear;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public Date getProductYear() {
        return productYear;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void displayProduct(){
        StringBuilder builder= new StringBuilder();
        builder.append("ProductId :").append(this.productID).append("\n")
                .append("ProductName:").append(this.productName).append("\n")
                .append("ProductYear:").append(this.productYear).append("\n")
                .append("ProductPrice").append(this.productPrice).append("\n");
        System.out.println(builder);;
//    }
//    public String displayProductAf(){
//        StringBuilder builder= new StringBuilder();
//        builder.append("ProductId").append(this.productID).append("\n")
//                .append("ProductName:").append(this.productName).append("\n")
//                .append("ProductYear:").append(this.productYear).append("\n")
//                .append("ProductPrice").append(this.productPrice).append("\n");
//
//        return builder.toString();
    }

}
