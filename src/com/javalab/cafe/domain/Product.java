package com.javalab.cafe.domain;

/**
 * 상품 도메인(값만 저장하는 데이터) 클래스
 * - 속성(멤버변수) : 상품id, 상품명, 카테고리id, 상품가격
 */
public class Product {
    // 1. 필드, 속성, 멤버변수
    private int productId;      // 상품id, 상품을 유니크하게 구분
    private String productname; // 상품명
    private int categoryId;     // 카테고리id, 어떤 카테고리에 속하는지
    private int price;   // 상품가격

    // 2. 기본생성, 파라미터가 없는 생성자
    public Product() {

    }

    // 3. 생성자, 파라미터가 있는 생성자
    public Product(int productId, String productname, int categoryId, int price) {
        this.productId = productId;
        this.productname = productname;
        this.categoryId = categoryId;
        this.price = price;
    }

    //getter, setter
    //productId
    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }

    //productname
    public String getProductname() {
        return productname;
    }
    public void setProductname(String productname) {
        this.productname = productname;
    }

    //categoryId
    public int getCategoryId() {
        return categoryId;
    }
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}
