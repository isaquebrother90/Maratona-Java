package javacore.introducaometodos.test;

import javacore.introducaometodos.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.cpf = "122.222.232-20";
        prof.matricula = "11122";
        prof.nome = "Marcos";
        prof.rg = "122211-5";

        Professor prof2 = new Professor();
        prof2.cpf = "322.422.732-12";
        prof2.matricula = "22233";
        prof2.nome = "João";
        prof2.rg = "31111-6";

        prof.imprime(prof);
        prof.imprime(prof2);

    }
}
