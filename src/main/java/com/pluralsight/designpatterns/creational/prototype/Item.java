package com.pluralsight.designpatterns.creational.prototype;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Item implements Cloneable{

    private String title;
    private double price;
    private String url;

    @Override
    public Item clone() throws  CloneNotSupportedException{
        return (Item) super.clone();
    }
}
