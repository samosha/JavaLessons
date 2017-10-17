package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    byte num = 2;
        int i = 2544646;
        long l = 45444;
        float num_2 = 645.4564f;
        double num_3;
        num_3 = 45465.456f;
        char sym = 'A';

        boolean is_hapy = true;
        String str = "Hello World!!";

        Scanner myscan = new Scanner(System.in);
        String myName;
        myName = myscan.nextLine();

        System.out.println("Hello my name is "+ myName);
	    System.out.print("Variable = " + num +" "+ i+ "  "+sym + "  "+ is_hapy +"  "+ str);




    }
}
