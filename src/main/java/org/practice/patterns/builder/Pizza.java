package org.practice.patterns.builder;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Pizza {

    private String base;
    private String cheese;
    private String sauce;
    private List<String> toppings;


}
