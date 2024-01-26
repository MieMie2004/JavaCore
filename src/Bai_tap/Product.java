package Bai_tap;

import BAI7.MainTeacher;

public class Product {
//    .containe để tìm km kí tự trong chuỗi
//    sd arraylist
//            xây dựng chương trinh dung để ql sp
//            sp co các thuộc tính :
//
//    1. mã sp -> productId--> int (1-100)
//    2. tên sp -> productName-> String(product A, product B )
//    3. loại sản phẩm -> categoryProduct-> String( a-b-c-d);
//    4.giá sp-> productPruce -> float (5sp <1000 , 5sp >1000);
//    5. tinh trạng -> available--> boolean (true/false),;
//    1 construstor de truyen vao 5 thuc tinh - 1 construstor khong co tham so
//    method getter và setter;
//    function cho mỗi bai tap;
////    chuong trình se có những hức năng chính sau
//    1. thêm 10 sp vào tập hợp;
//    2. hiễn thị danh sách sp; ( available true--> còn hàng , false ết hàng
//    3. cập nhayatj lại thông tin saản phẩm voi sp co category - B ( cập nhật lại tên sp:+update- tình trang! - gia sp+100);
//    4. Xóa sp ra khỏi ập hợp nếu như sp đó tình trrangj là false và gia <1000
//    5. Tim kiem theo ten sp;
//    6. sx sp theo gi giảm dần;
//    7. hiểm thị những sp cconf hàn - available-- trrue
//    8. xóa toàn bộ sp ra khoi tập hợp

    private int productId;
    private String productName;
    private String categoryProduct;
    private float productPrice;
    private boolean available;

    public Product ( int productId, String productName, String categoryProduct, float productPrice, boolean available){
        this.productId= productId;
        this.productName= productName;
        this.productPrice= productPrice;
        this.categoryProduct=categoryProduct;
        this.available= available;
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

    public void setCategoryProduct(String categoryProduct) {
        this.categoryProduct = categoryProduct;
    }

    public String getCategoryProduct() {
        return categoryProduct;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean isAvailable() {
        return available;
    }
    public  void productList(){
        String stt = available? "còn hàng": "hết hàng";
        StringBuilder result = new StringBuilder();
        result.append("productId :").append( this.productId).append("\n")
                .append("productName :").append(this.productName).append("\n")
                .append("productPrice :"). append(this.productPrice).append("\n")
                .append("categoryProduct :").append(this.categoryProduct).append("\n")
                .append("available :").append(stt).append("\n");
        System.out.println(result);
    }



}
