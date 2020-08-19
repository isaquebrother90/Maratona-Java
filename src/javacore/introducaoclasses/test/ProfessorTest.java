package javacore.introducaoclasses.test;

import javacore.introducaoclasses.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.nome = "William Suane";
        prof.matricula = "3456";
        prof.rg = "12.232.234-8";
        prof.cpf = "132.567.897-32";

        Professor prof2 = new Professor();
        prof2.nome = "Isaque Moura";
        prof2.matricula = "2356";
        prof2.rg = "45.334.543-4";
        prof2.cpf = "234.454.321-22";

        System.out.println("\n Nome do professor: " + prof.nome + "\n Matrícula: " +
                prof.matricula + "\n RG: " + prof.rg + "\n CPF: " + prof.cpf);
        System.out.println("--------------------------------");
        System.out.println("\n Nome do professor: " + prof2.nome + "\n Matrícula: " +
                prof2.matricula + "\n RG: " + prof2.rg + "\n CPF: " + prof2.cpf);

    }
}
