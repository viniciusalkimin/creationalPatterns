package com.pluralsight.designpatterns.creational.singleton;

public class DBSingletoneDemo {
    public static void main(String[] args) {

        DBSingleton instance = DBSingleton.getInstance();
        System.out.println(instance);

        /* Dont run, because constructor is static, for implementing pattern singleton
        DBSingleton instance = new DBSingleton();*/

        DBSingleton instance2 = DBSingleton.getInstance();
        System.out.println(instance2);
    }
}
