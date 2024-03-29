package com.HeadFirstDesignPatterns;

public interface QuackBehavior {

    public void quack();

    public class Quack implements QuackBehavior {
        public void quack(){
            System.out.println("Quack");
        }
    }

    public class MuteQuaack implements QuackBehavior {
        public void quack() {
            System.out.println("<< Silence >>");
        }
    }

    public class Squeak implements QuackBehavior {
        public void quack () {
            System.out.println("Squeak");
        }
    }

}
