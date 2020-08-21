package javacore.introducaometodos.classes;

// Crie os seguintes atributos para essa classe:
  //Nome
  //Matrícula
  //Rg
  //Cpf
// Crie uma classe de teste para preencher e imprimir os dados
// desse professor.
public class Professor {
    public String nome;
    public String matricula;
    public String rg;
    public String cpf;

    public void imprime(Professor prof) {
        System.out.println("-------------------------");
        System.out.println(prof.cpf);
        System.out.println(prof.matricula);
        System.out.println(prof.nome);
        System.out.println(prof.rg);
    }
}
