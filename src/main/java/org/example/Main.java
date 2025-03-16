package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Calculator calc = new Calculator();
        calc.startCalculator(scanner);

    }
}