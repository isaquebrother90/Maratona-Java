package introducao;

/*
Crie um algoritmo que possua as variáveis nome, salário, sexo
(M ou F), idade e estado civil.
Imprima da seguinte forma:
O trabalhador(a) <nome> do sexo<sexo>, idade<idade>, estado civil
<estadocivil>, salario<salário> encontra-se empregado neste
estabelecimento.
 */
public class CadastroFuncionario {
    public static void main(String[] args) {
        String nome = "Isaque";
        String sexo = "M";
        byte idade = 29;
        String estadoCivil = "Casado";
        double salario = 2550.55;
        System.out.println("O trabalhador(a) " + nome + ", do sexo " + sexo + ", idade " + idade + ", estado civil " +
                estadoCivil + ", salário " + salario + ", encontra-se empregado neste estabelecimento.");
    }
}
