package javacore.introducaoclasses.classes;

public class ExercicioEstudante {

    private String nome;
    private int idade;
    private double notaUm;
    private double notaDois;
    private double notaTres;
    private double[] notas;

    public ExercicioEstudante() {

    }

    public ExercicioEstudante(String nome, int idade, double notaUm, double notaDois, double notaTres, double[] notas) {
        this.nome = nome;
        this.idade = idade;
        this.notaUm = notaUm;
        this.notaDois = notaDois;
        this.notaTres = notaTres;
        this.notas = notas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    /* Primeira forma que resolvi
    public void setNotaUm(double notaUm) {
        this.notaUm = notaUm;
    }

    public void setNotaDois(double notaDois) {
        this.notaDois = notaDois;
    }

    public void setNotaTres(double notaTres) {
        this.notaTres = notaTres;
    }
     */

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public void print() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if(notas != null) {
            for(double nota : notas) {
                System.out.print(nota + " ");
            }
        }

    }

//    public double imprimeMedia() {
//        double calculo = (this.notaUm + this.notaDois + this.notaTres) / 3;
//        return calculo;
//    }

    public void tirarMedia() {
        if(notas == null) {
            System.out.println("Esse anluno não possui notas!");
            return;
        }

        double media = 0;
        for (double nota : notas) {
            media += nota;
        }
        media = media / notas.length;

        if (media > 6) {
            System.out.println("A média é: " + media + " Situação: Aprovado");
            return;
        }
        System.out.println("A média é: " + media + " Situação: Reprovado");
    }

}
