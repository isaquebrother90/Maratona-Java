package javacore.introducaometodos.test;

import javacore.introducaometodos.classes.Calculadora;

public class ParametrosTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int num1 = 5;
        int num2 = 10;
        calc.alteraDoisNumeros(num1, num2);
        System.out.println("Dentro do teste");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }
}
