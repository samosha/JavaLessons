package com.company;

/**
 * Created by LM14 on 17.10.2017.
 */
public class oopFirstStep {
    public static void main(String[] args) {
        Person maks = new Person();
        maks.height = 180;
        maks.weight=78.4f;

        maks.say("Hi I am Maks");
        System.out.println(maks.height);

        Person oleg = new Person();
        oleg.height = 195;
        oleg.weight= 96.7f;
        System.out.print(oleg.height);
    }
}
