package com.company;

import java.util.Scanner;

public class Hiv {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String symbols;
        symbols = str.nextLine();
        if (symbols.equals("Вячеслав")) {
            System.out.print("Привет, " + symbols);
        } else {
            System.out.print("Нет такого имени");
        }
    }
}
