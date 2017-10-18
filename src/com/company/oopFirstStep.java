package com.company;

/**
 * Created by LM14 on 17.10.2017.
 */
public class oopFirstStep {
    public static void main(String[] args) {
        Person maks = new Person(180,75.6f);


        maks.say("Hi I am Maks");
        System.out.println(maks.height);

        Person oleg = new Person();
        oleg.height = 195;
        oleg.weight= 96.7f;
        System.out.println(oleg.height);

        Student vova = new Student(170, 74.5f, 5);
        System.out.println("Hello my name is vova. I'm student on " + vova.course + " course!");
    }
}
