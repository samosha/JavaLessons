package com.company;
import java.util.Scanner;

/**
 * Created by LM14 on 17.10.2017.
 */
public class lessonsMathematicks {
    public static void lessonsMathematicks (String[] args) {
        float num_1, num_2, res;

        Scanner iscan = new Scanner(System.in);

        num_1 = iscan.nextFloat();

        Scanner iscan2 = new Scanner(System.in);
        num_2= iscan2.nextFloat();
        res = num_1 + num_2;

        System.out.print(res);
    }
}
