package com.company.animals;

import com.company.Animals;

public class Sheep extends Animals {
    public Sheep(int weight, int age, char gender, String nickName) {
        super(weight, age, gender, nickName);
    }


    public Sheep() {
    }


    @Override
    public String toString() {
        return "Sheep_ " + super.toString();
    }
}
