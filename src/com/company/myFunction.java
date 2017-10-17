package com.company;

import java.util.Scanner;

/**
 * Created by LM14 on 17.10.2017.
 */
public class myFunction {
    public static void main(String[] args) {
        Scanner funcA = new Scanner(System.in);
        int a = funcA.nextInt();
        int temp = func(a, 74);
        System.out.print("Result is: "+temp);
    }
   public static int func(int a, int b){
        int res;
        res = a + b;
        return res;

    }
}
