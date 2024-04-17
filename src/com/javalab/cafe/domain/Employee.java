package com.javalab.cafe.domain;

/**
 * 사원 도메인 클래스
 * - 속성(멤버변수) : 직원id, 직원명, 직급명, 급여
 */
public class Employee {
    private int employeeId;
    private String name;
    private String position;
    private int salary;

    // 기본 생성자
    public Employee() {
    }

    // 생성자2
    public Employee(int employeeId, String name, String position, int salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    //getter setter
    //Employee
    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    //name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //position
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    //salary
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
