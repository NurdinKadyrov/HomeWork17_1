package com.company;

import com.company.animals.Cow;
import com.company.animals.Horse;
import com.company.animals.Sheep;

public class Main {

    public static void main(String[] args) {

        Cow cow1 = new Cow(150,3,'m',"MooMoo");
        Cow cow2 = new Cow(155,3,'w',"CooCoo");
        Cow cow3 = new Cow(160,4,'m',"SooSoo");
        Cow cow4 = new Cow(165,5,'w',"FooFoo");
        Cow cow5 = new Cow(140,2,'m',"LooLoo");

        Sheep sheep1 = new Sheep(70,4,'m',"ThickSheep");
        Sheep sheep2 = new Sheep(20,1,'w',"BlackSeep");
        Sheep sheep3 = new Sheep(50,2,'w',"lambSeep");

        Horse horse1 = new Horse(70,4,'m',"ThickSheep","White");
        Horse horse2 = new Horse(70,4,'m',"ThickSheep","Black");

        Farm farm1 = new Farm();
        farm1.setAddress("Farm1");
        farm1.setOwnerName("Nurdin");
        farm1.setCows(new Cow[]{cow1,cow2,cow3,cow4,cow5});
        farm1.setSheeps(new Sheep[]{sheep1,sheep2,sheep3});
        farm1.setHorses(new Horse[]{horse1,horse2});

        Farm farm2 = new Farm();
        farm2.setAddress("Farm2");
        farm2.setOwnerName("Max");
        farm2.setSheeps(new Sheep[]{sheep1});
        farm2.setCows(new Cow[]{ cow1});
        farm2.setHorses(new Horse[]{horse1});

        System.out.println(farm1);
        System.out.println(farm2);
    }
}
