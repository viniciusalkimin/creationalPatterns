package com.pluralsight.designpatterns.creational.builder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LaunchOrderBean {

    private String bread;
    private String condiments;
    private String dressing;
    private String meat;
}
