package com.pluralsight.designpatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeEverydayDemo {
    public static void main(String[] args) {

        String sql = "select * from movies where title = ?";

        List<String> paramenters = new ArrayList<>();

        paramenters.add("Star wars");

        Record record = new Record();

        Statement firstStatement = new Statement(sql, paramenters, record);
        System.out.println(firstStatement.getSql());
        System.out.println(firstStatement.getParameters());
        System.out.println(firstStatement.getRecord());

        Statement secondStatement = firstStatement.clone();
        System.out.println(secondStatement.getSql());
        System.out.println(secondStatement.getParameters());
        System.out.println(secondStatement.getRecord());


    }
}
