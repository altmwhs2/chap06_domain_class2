package com.javalab.cafe.arraylist;

import com.javalab.cafe.domain.Employee;

import java.util.ArrayList;

public class ArrayListExample03 {
    public static void main(String[] args) {

        // Employee 타입의 객체를 저장활 수 있는 ArrayList 객체 생성
        ArrayList<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee(1001,"홍길동","대리",3000));
        employeeList.add(new Employee(1002,"김철수","과장",4000));
        employeeList.add(new Employee(1003,"이영희","부장",5000));
        asd(employeeList);
    } // end of main

    private static void asd(ArrayList<Employee> employeeList) {
        // ArrayList에 저장된 Employee 객체 출력
        for(Employee e : employeeList) {
            System.out.println(e.getEmployeeId() + " " + e.getName() + " " + e.getPosition() +" " + e.getSalary());
        }

    }
}
