package com.javalab.cafe.excute;

import com.javalab.cafe.data.ArrayDatabase;
import com.javalab.cafe.domain.Category;
import com.javalab.cafe.domain.Employee;
import com.javalab.cafe.domain.Order;
import com.javalab.cafe.domain.Product;

/**
 * 카페 관리 시스템
 * - 주문, 사원, 상품, 카테고리 도메인 클래스를 이용한 카페 관리 시스템
 * - 주문, 사원, 상품, 카테고리 정보를 배열(Array)에 저장하고 관리
 * - 데이터 전담 클래스를 객체로 생성하여 기초 데이터 생성 작업
 */
public class CafeManagementArray {
    public static void main(String[] args) {
        // 데이터 전용 클래스 객체 생성, 생성자에서 데이터가 만들어진다.
        ArrayDatabase db = new ArrayDatabase();

        // 카테고리 정보 출력
        Category[] categories = db.getCategories(); // 데이터 전담 객체에서 카테고리 정보 가져옴
        showCategories(categories);
        // 상품 정보 출력
        Product[] products = db.getProducts(); // 데이터전담 객체에서 상품 정보 가져옴
        showProducts(products); // 상품 정보 출력

        Employee[] employees = db.getEmployees(); // 데이터 전담 객체에서 카테고리 정보 가져옴
        showEmployee(employees); // 사원 정보 출력

        Order[] orders = db.getOrders();
        showOrders(orders);



    }// end of main

    // 주문 정보 출력 메소드
    public static void showOrders(Order[] orders){
        System.out.println("주문 정보");
        System.out.println("주문번호\t주문일자\t사원번호\t상품번호\t수량\t금액");
        System.out.println("-------------------------------");
        for(Order order : orders){
            if(order != null){
                System.out.println(order.getOrderId() + "\t" + order.getOrderDate()
                        + "\t" + order.getEmployeeId() + "\t"
                        + order.getProductId() + "\t" + order.getQuantity());
            }
        }
    }


    public static void showEmployee(Employee[] employees){
        System.out.println("사원 정보");
        System.out.println("사원번호\t 직원명\t 직급\t 급여");
        System.out.println("---------------------------");
        for(Employee e : employees){
            System.out.println(e.getEmployeeId() + "\t" + e.getName() + "\t" + e.getPosition() + "\t" + e.getSalary());
        }
    }

    public static void showProducts(Product[] products) {
        System.out.println("상품 정보");
        System.out.println("상품번호\t 상품명\t 카테고리\t 상품가격");
        System.out.println("---------------------------");
        for(Product p : products) {
            System.out.println(p.getProductId() + "\t" + p.getProductname() + "\t" + p.getCategoryId() + "\t" + p.getPrice());
        }
    }

    //카테고리 정보 출력 메소드
    public static void showCategories(Category[] categories) {
        System.out.println("카테고리 정보");
        System.out.println("카테고리번호\t 카테고리명\t 설명");
        System.out.println("---------------------------");
        for(Category c : categories) {
            System.out.println(c.getCategoryId() + "\t" + c.getName() + "\t" + c.getDescription());
        }
    }
}