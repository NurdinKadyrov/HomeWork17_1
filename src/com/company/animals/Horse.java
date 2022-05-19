package com.company.animals;

import com.company.Animals;

public class Horse extends Animals {
    private String color;

    public Horse(int weight, int age, char gender, String nickName, String color) {
        super(weight, age, gender, nickName);
        this.color = color;
    }


    public Horse() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Horse_" +
                "color='" + color + '\''+ super.toString();
    }
}
