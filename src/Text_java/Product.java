package Text_java;

import java.util.Date;

public class Product {
    private int productId;
    private String productName;
    private float productPrice;
    private boolean avilable;
    private Date saleDate;

    public Product(){}
    public  Product (int productId, String productName, float productPrice, boolean avilable, Date saleDate){
        this.productId= productId;
        this.productName= productName;
        this.productPrice=productPrice;
        this.avilable=avilable;
        this.saleDate=saleDate;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setAvilable(boolean avilable) {
        this.avilable = avilable;
    }

    public boolean isAvilable() {
        return avilable;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

    public Date getSaleDate() {
        return saleDate;
    }
    public void displayInformationProductInput(){
        StringBuilder builder = new StringBuilder();
        builder.append("productID:").append(this.productId).append("\n")
                .append("prductName:").append(this.productName).append("\n")
                .append("productPrice:").append(this.productPrice).append("\n")
                .append("Avilable;").append(this.avilable).append("\n")
                .append("saleDate:").append(this.saleDate).append("\n");
        System.out.println(builder);

    }

    public void displayInformationProduct(){
        String stt = avilable? "con hang": "het hang";
        StringBuilder builder = new StringBuilder();
        builder.append("productID:").append(this.productId).append("\n")
                .append("prductName:").append(this.productName).append("\n")
                .append("productPrice:").append(this.productPrice).append("\n")
                .append("Avilable;").append(stt).append("\n")
                .append("saleDate:").append(this.saleDate).append("\n");
        System.out.println(builder);

    }
}
