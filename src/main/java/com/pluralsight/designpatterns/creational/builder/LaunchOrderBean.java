package com.pluralsight.designpatterns.creational.builder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class LaunchOrderBean {

    private String bread;
    private String condiments;
    private String dressing;
    private String meat;
}
