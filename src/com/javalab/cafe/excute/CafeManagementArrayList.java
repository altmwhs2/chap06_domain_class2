package com.javalab.cafe.excute;

import com.javalab.cafe.data.ArrayListDatabase;
import com.javalab.cafe.domain.Category;
import com.javalab.cafe.domain.Employee;
import com.javalab.cafe.domain.Order;
import com.javalab.cafe.domain.Product;

import java.util.ArrayList;
import java.util.EnumMap;

/**
 * 카페 관리 시스템
 * - ArrayListDatabase 클래스를 이용한 카페 관리 시스템
 * - 주문, 사원, 상품, 카테고리 정보를 ArrayList에 저장하고 관리
 * - 데이터 전담 클래스를 만들어서 기초 데이터 생성 작업
 */


public class CafeManagementArrayList {
    public static void main(String[] args) {
        // ArrayList 형태로 된 데이터베이스 객체 생성
        ArrayListDatabase db = new ArrayListDatabase();

        // 카테고리 ArrayList 객체 얻기 - 카테고리 정보 출력
        ArrayList<Category> categories = db.getCategoryList();
        showCategorylist(categories);

        // 상품 Arraylist 객체 얻기 - 상품 정보 출력
        ArrayList<Product> products = db.getProductList();
        //showProductList(products);

        // 주문 ArrayList 객체 얻기 - 주문 정보 출력
        ArrayList<Order> orders = db.getOrderList();

        ArrayList<Employee> employees = db.getEmployeeList();
        showEmployeeList(employees);

        showProductsWiwhCategoryName(products, categories);
        showOrderList(orders, employees, products);

    } // end

    // 상품 정보 출력
            // 사원 정보 출력
    public static void showEmployeeList(ArrayList<Employee> employees){
        System.out.println("사원 정보");
        System.out.println("사원번호\t 직원명\t 직급\t 급여");
        System.out.println("---------------------------");
        for(Employee e : employees){
            System.out.println(e.getEmployeeId() + "\t" + e.getName() + "\t" + e.getPosition() + "\t" + e.getSalary());
        }
    }
    public static void showProductsWiwhCategoryName(ArrayList<Product> products, ArrayList<Category> categories) {
        System.out.println("상품 정보");
        System.out.println("상품번호\t 상품명\t 카테고리\t 상품가격\t 카테고리명");
        System.out.println("---------------------------");
        for (Product p : products) {
            int categoryId = p.getCategoryId(); //현재 상품의 카테고리Id >>
            if (categoryId != 0) { // 값이 없으면 no 출력
                for (Category c : categories) {    // 카테고리 for문
                    if (c.getCategoryId() == categoryId) { //카테고리 id와 상품 카테고리의 id가 같으면 카테고리명 출력
                        System.out.println(p.getProductId() + "\t" + p.getProductname() + "\t" + p.getCategoryId() + "\t" + p.getPrice() +
                                ", 카테고리명: " + c.getName());
                        break;

                    }
                }
            }

        }

    }
    // 주문 정보 출력
    public static void showOrderList(ArrayList<Order> orders, ArrayList<Employee> employees, ArrayList<Product> products) {
        System.out.println("주문 정보");
        System.out.println("주문번호\t주문일자\t상품명\t수량\t담당직원명");
        System.out.println("-------------------------------");
        for (Order o : orders) {
            int employeeId = o.getEmployeeId();
            int productId = o.getProductId();
            if (employeeId != 0) {
                for (Employee e : employees) {
                    if (e.getEmployeeId() == employeeId) {
                        if (productId != 0) {
                            for (Product p : products) {
                                if (p.getProductId() == productId) {
                                    System.out.println(o.getOrderId() + "\t" + o.getOrderDate()
                                            + "\t" + p.getProductname() + "\t"
                                            + o.getQuantity() + "\t"
                                            + "\t" + e.getName());
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    // 카테고리 정보 출력
    public static void showCategorylist(ArrayList<Category> categories){
        System.out.println("카테고리 정보");
        System.out.println("카테고리번호\t 카테고리명\t 설명");
        System.out.println("============================");
        for(Category c : categories){
            System.out.println(c.getCategoryId() + "\t" + c.getName() + "\t" + c.getDescription());
        }
    }
}
