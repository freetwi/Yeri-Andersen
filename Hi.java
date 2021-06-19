package com.company;

import java.util.Scanner;

public class Hi {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int i;
        i = num.nextInt();
        if (i > 7) {
            System.out.print("Привет");
        }
    }
}
