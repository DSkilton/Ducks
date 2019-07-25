package com.HeadFirstDesignPatterns;

public class MallardDuck extends Duck{

    public MallardDuck() {
        quackBehavior = new QuackBehavior.Quack();
        flyBehavior = new FlyBehavior.FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }

}
