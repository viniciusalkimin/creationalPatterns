package com.pluralsight.designpatterns.creational.builder;

public class LaunchOrderBeanDemo {
    public static void main(String[] args) {

        //Object doesn't is immutable
        LaunchOrderBean launchOrder = new LaunchOrderBean();
        launchOrder.setBread("Wheat");
        launchOrder.setCondiments("Lettuce");
        launchOrder.setDressing("Mustard");
        launchOrder.setMeat("Ham");

        System.out.println(launchOrder.getBread());
        System.out.println(launchOrder.getCondiments());
        System.out.println(launchOrder.getDressing());
        System.out.println(launchOrder.getBread());
    }


}

