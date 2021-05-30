package com.theglobaltalks;

import java.util.Scanner;

public class Person {
    String a = "Hey, ";
    Scanner ob2 = new Scanner(System.in);
    String b = ob2.next();
    int d =ob2.nextInt();
    int c = ob2.nextInt();

    String repeat(){
        String r = (a + b);
        return r;
    }
    int value(){
        int v = d*c;
        return v;
    }
}