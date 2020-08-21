package javacore.introducaometodos.test;

import javacore.introducaometodos.classes.Calculadora;

import java.sql.SQLOutput;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();
        calc.subtraiDoisNumeros();
        calc.multiplicaDoisNumeros(55.5,5);
        System.out.println("Divisão de dois números.");
        double result = calc.divideDoisNumeros(20,4);
        System.out.println(result);
        System.out.println("Imprimindo dois números divididos");
        calc.imprimeDoisNumerosDivididos(20,5);//Não se deve imprimir um método void dentro de System.out.print.
        System.out.println("Continuando a execução...");

    }
}
