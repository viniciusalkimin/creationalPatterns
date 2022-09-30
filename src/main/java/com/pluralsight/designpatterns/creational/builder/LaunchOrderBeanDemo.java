package com.pluralsight.designpatterns.creational.builder;

public class LaunchOrderBeanDemo {
    public static void main(String[] args) {

        //Object is immutable because of the telescoping constructor
     //   LaunchOrderBean launchOrder = new LaunchOrderBean("Wheat","Lettuce","Mustard","Ham");

        LaunchOrderBean.Builder builder = new LaunchOrderBean.Builder();
        builder.bread("Whaet").dressing("Mayo").condiments("Lettuce").meat("Turkey").build();
        LaunchOrderBean launchBuilded = builder.build();


        System.out.println(launchBuilded.getBread());
        System.out.println(launchBuilded.getCondiments());
        System.out.println(launchBuilded.getDressing());
        System.out.println(launchBuilded.getBread());
    }


}

