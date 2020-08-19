package introducao.controlefluxo;

public class ControleDeFluxo {
    public static void main(String[] args) {
        //Se idade < 15 categoria infantil
        //Se idade >= 15 && idade < 18 Juvenil
        //idade >= 18 adulto
        int idade = 19;
        String categoria;

        if (idade < 15) {
            categoria = "Infantil";
        }else if (idade >= 15 && idade < 18) {
            categoria = "Juvenil";
        } else {
            categoria = "Adulto";
        }
        System.out.println(categoria);
    }
}
