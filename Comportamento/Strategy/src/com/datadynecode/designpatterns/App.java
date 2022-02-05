package com.datadynecode.designpatterns;

public class App {

    public static void main(String[] args) {

        Person p = new Person("José");
        p.move(new RunMovement(), 50);
    }

}
