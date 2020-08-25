package javacore.introducaoclasses.test;

import javacore.introducaoclasses.classes.ExercicioEstudante;

public class ExercicioEstudanteTest {

    public static void main(String[] args) {

        ExercicioEstudante exerc = new ExercicioEstudante();

        exerc.setNome("Isaque Moura");
        exerc.setIdade(30);
     //    exerc.setNotas(new double[]{1,9,4});
        exerc.print();
        System.out.println();
        exerc.tirarMedia();

//      Primeira forma que resolvi
//        exerc.setNotaUm(5);
//        exerc.setNotaDois(9);
//        exerc.setNotaTres(4);
        
//        double calcResult = exerc.imprimeMedia();
//        if(calcResult > 6) {
//            System.out.println("Aprovado");
//        }else {
//           System.out.println("Reprovado");
//        }

    }

}
