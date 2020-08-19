package introducao.controlefluxo;

/*
Crie uma variável salário e imprima seu imposto.
Crie uma tabela de imposto
salario < 1000 5%
salario >= 1000 && salario < 2000 10%
salario >= 2000 && salario < 4000 15%
salario > 5000 20%
 */
public class ExercicioControleFluxo {
    public static void main(String[] args) {
        double salario = 2500;
        double totalImposto = 0;

        if (salario < 1000) {
            totalImposto = salario * 0.05;
        } else if (salario >= 1000 && salario < 2000) {
            totalImposto = salario * 0.10;
        } else if (salario >= 2000 && salario < 4000) {
            totalImposto = salario * 0.15;
        } else {
            totalImposto = salario * 0.20;
        }
        System.out.println("Seu imposto é de R$ " + totalImposto);
    }
}
