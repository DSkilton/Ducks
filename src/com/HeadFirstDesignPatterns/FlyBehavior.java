package com.HeadFirstDesignPatterns;

public interface FlyBehavior {
    public void fly();

    public class FlyWithWings implements FlyBehavior {
        public void fly() {
            System.out.println("I'm flying!");
        }
    }

    public class FlyNoWay implements FlyBehavior {
        public void fly() {
            System.out.println("I Can't fly");
        }
    }

    public class FlyRocketPowered implements FlyBehavior {
        public void fly() {
            System.out.println("I'm flying with a rocket!");
        }
    }
}