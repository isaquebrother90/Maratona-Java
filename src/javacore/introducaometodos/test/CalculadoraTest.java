package javacore.introducaometodos.test;

import javacore.introducaometodos.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();
        System.out.println("Continuando a execução...");
        calc.subtraiDoisNumeros();

    }
}
