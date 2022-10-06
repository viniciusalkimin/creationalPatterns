package com.pluralsight.designpatterns.creational.prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class Statement implements Cloneable{

    private String sql;
    private List<String> parameters;
    private Record record;


    @Override
    public Statement clone() {
        try {
            Statement clone = (Statement) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
