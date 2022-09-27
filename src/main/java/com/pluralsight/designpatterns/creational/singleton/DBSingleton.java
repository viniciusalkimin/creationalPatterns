'package com.pluralsight.designpatterns.creational.singleton;

public class DBSingleton {

    private static DBSingleton instance = null;

    private DBSingleton() {
    }

    public static DBSingleton getInstance() {
        if (instance == null) {
            intance = new DBSingleton();
        }
        return instance;
    }
}
'