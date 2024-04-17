package com.javalab.cafe.arraylist;

import java.util.ArrayList;

public class ArrayListExample02 {
    public static void main(String[] args) {

        // Human 타입의 객체를 저장할 수 있는 ArrayList 객체 생성
        ArrayList<Human> humanList = new ArrayList<Human>();
        humanList.add(new Human("홍길동", 20));
        humanList.add(new Human("김철수", 30));
        humanList.add(new Human("조수진", 50));

        // 출력
        System.out.println("첫번째 객체 : " + humanList.get(0).getName() + " " + humanList.get(0).getAge());
        System.out.println("두번째 객체 : " + humanList.get(1).getName() + " " + humanList.get(1).getAge());
        System.out.println("세번째 객체 : " + humanList.get(2).getName() + " " + humanList.get(2).getAge());

        // for 출력
        for(Human human : humanList) {
            System.out.println(human.getName() + " " + human.getAge());
        }

    } // end main
}

class Human{
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
