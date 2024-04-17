package com.javalab.cafe.domain;

/**
 * 카테고리 클래스
 * - 속성(멤버변수) : 카테고리id, 카테고리명, 카테고리설명
 */
public class Category {
    // 속성 정의(멤버 변수, 필드)
    private int categoryId;    // 카테고리id
    private String name;        // 카테고리명
    private String description; // 카테고리 설명

    // 생성자
    public Category() {

    }

    // 생성자2
    public Category(int categoryId, String name, String description) {
        this.categoryId = categoryId;
        this.name = name;
        this.description = description;
    }

    // getter, setter 메서드
    // categoryId getter, setter
    public int getCategoryId() {
        return categoryId;
    }
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    // name getter, setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // description getter, setter
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
