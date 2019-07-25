package com.HeadFirstDesignPatterns;

public class ModelDuck extends Duck{
    public ModelDuck(){
        flyBehavior = new FlyBehavior.FlyNoWay();
        quackBehavior = new QuackBehavior.Quack();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}
