package introducao.controlefluxo;

/*
  Imprima todos os números pares de 0 a 100.000
 */
public class ExercicioControleFluxo3 {
    public static void main (String[] args) {
        int valor = 100000;
        for (int i = 0;i <= valor;i++) {
            int resto = i % 2;
            if (resto == 0) { // Para achar os impares era só retirar o == e colocar !=
                System.out.println(i);
            }
        }
    }
}
