package com.telran.project.videokursaz;

import java.util.Scanner;

public class Claculator {
    public static void main(String[] args) {
        double d = calculate();
        System.out.println(d);
    }

    public static double calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a : ");
        double a = scanner.nextDouble();
        System.out.println("enter b : ");
        double b = scanner.nextDouble();
        System.out.println("enter operation ( 1 +;2 -;3 *;4 /; )");
        int operation = scanner.nextInt();

        double result = 0;
        switch (operation) {
            case 1:
                result = MathUtil.addition(a, b);
                break;
            case 2:
                result = MathUtil.subtraction(a, b);
                break;
            case 3:
                result = MathUtil.multiplication(a, b);
                break;
            case 4:
                result = MathUtil.division(a, b);
                break;
            default:
                System.out.println("operation is not correct");
                break;
        }
        return result;
    }
}