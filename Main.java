package com.withWahib;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println(" أدخل النص الاول : ");
        String s1 = in.nextLine();
        System.out.println(" أدخل النص الثاني : ");
        String s2 = in.nextLine();

        System.out.println("النص 1: " + s1);
        System.out.println("النص 2: " + s2);

        // عملية المقارنة
        int S = s1.compareTo(s2);

        // طباعة نتيجة المقارنة
        if (S < 0) { System.out.println("\"" + s1 + "\"" + " أكبر من النص  " + "\"" + s2 + "\""+" في القيمة الموجودة على جدول ترقيم الحروف ");
        } else if (S == 0) {
            System.out.println("\"" + s1 + "\"" + " يساوي النص  " + "\"" + s2 + "\""+" في القيمة الموجودة على جدول ترقيم الحروف ");
        } else if (S > 0) {
            System.out.println("\"" + s1 + "\"" + " أقل من النص " + "\"" + s2 + "\""+" في القيمة الموجودة على جدول ترقم الحروف ");
        }
    }
}
