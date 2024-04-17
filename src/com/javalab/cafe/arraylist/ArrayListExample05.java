package com.javalab.cafe.arraylist;


import java.util.ArrayList;

/**
 * ArrayList를 이용한 예제
 * - ArrayList를 메소드에 전달해서 소속된 객체들의 특정 속성을 변경
 *   변경된 item 객체들을 새로운 ArrayList 에 저장
 */
public class ArrayListExample05 {
    public static void main(String[] args) {
        // Item 객체를 저장할 수 있는 ArrayList 객체 생성
        ArrayList<Item> items = new ArrayList<>(); // 타입추론

        Item h1 = new Item(1001, "아메리카노", 3000);
        Item h2 = new Item(1002, "카페라떼", 4000);
        Item h3 = new Item(1003, "카푸치노", 4500);

        items.add(h1);
        items.add(h2);
        items.add(h3);
        showItems(items);
        System.out.println();

        ArrayList<Item> updatedPrice = null; // 변수 선언
        updatedPrice = showIncreasePrice(items); // 메소드 호출해서 돌아오는 값 할당
        showItems(updatedPrice); // 메소드 호출해서 돌아오는 값 출력

    } // end of main

    public static ArrayList<Item> showIncreasePrice(ArrayList<Item> items){
        // 가격 인상률
        double percentIncrease = 10.0; // 가격 인상율 10%
        ArrayList<Item> updatedItems = new ArrayList<>(); //가격 인상율이 반영된 상품 저작용 ArrayList
        for(Item item: items){
            // 가격 인상율이 반영된 금액 구하기
            double newPrice = item.getPrice() + (item.getPrice() * percentIncrease / 100);
            // 가격 인상된 Item 객체 생성
            Item tempItem = new Item(item.getId(), item.getName(), newPrice);
            // 가격 인상된 Item 객체를 새로운 ArrayList에 저장
            updatedItems.add(tempItem);
        }
        return updatedItems;
    }

    public static void showItems(ArrayList<Item> items) {
        // ArrayList에 저장된 Item 객체 출력
        for (Item item : items) {
            System.out.println(item.getId() + " " + item.getName() + " " + item.getPrice());
        }
    }




}

// 도메인 클래스, 이너클래스
class Item {
    private int id;
    private String name;
    private double price;

    public Item(){}
    public Item(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}