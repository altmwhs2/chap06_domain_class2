package com.javalab.cafe.arraylist;

import java.util.ArrayList;

public class ArrayListExample01 {
    public static void main(String[] args) {

        // String Type을 저장할 수 있는 ArrayList 객체 생성 > 자료형이 String
        ArrayList<String> strList = new ArrayList<String>();
        strList.add("Apple");
        strList.add("Banana");
        strList.add("Cherry");

        System.out.println("strList의 첫번째 객체 : " + strList.get(0));
        System.out.println("strList의 두번째 객체 : " + strList.get(1));
        System.out.println("strList의 세번째 객체 : " + strList.get(2));

        // ArrayList에 저장된 객체의 개수
        System.out.println("strList의 크기 : " + strList.size());

        // ArrayList에 저장된 객체 출력
        for(String str : strList) { // 향상된 for문 > 자료형이 String이니까 String 받고 변수명이 strList니까 strList를 줌
            System.out.println(str);
        }
    }
}
