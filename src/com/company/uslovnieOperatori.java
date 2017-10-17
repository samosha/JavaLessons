package com.company;

/**
 * Created by LM14 on 17.10.2017.
 */
public class uslovnieOperatori {

    public static void main (String[] args) {
        int i = 134, j=1;
        if (i==234 && j!=45){   /*два усовия должны выполнятся*/
            System.out.print("i is not 234");
        } else if (i>100 || j==45){ /*условия или то илт то*/
            System.out.print("i is bigger then 100");
        } else {
            System.out.print("i is uknown");
        }
    }
}
