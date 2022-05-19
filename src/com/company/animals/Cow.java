package com.company.animals;

import com.company.Animals;

public class Cow extends Animals {
    public Cow(int weight, int age, char gender, String nickName) {
        super(weight, age, gender, nickName);
    }

    public Cow() {
    }

    @Override
    public String toString() {
        return "Cow_ " + super.toString();
    }
}
