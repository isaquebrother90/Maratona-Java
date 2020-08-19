package introducao.controlefluxo;

/*
  Dado um valor de um carro, descubra em quantas vezes ele pode ser parcelado,
  porém as parcelas não podem ser menores do que 1000.
 */
public class ControleFluxo5 {
    public static void main(String[] args) {
        double valorTotal = 30000;
        int parcela = 0;

        while (parcela <= valorTotal) {
            parcela++;
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela " + parcela + " R$" + valorParcela);
        }
    }
}
