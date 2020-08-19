package introducao;

/*
Crie um algoritmo que possua variáveis para salvar os seguintes
dados: Nome, Endereço e Telefone de uma pessoa.
Imprima essas variáveis da seguinte forma:
 O <nome> domiciliado no endereço<endereco> e telefone<telefone>
não possui nenhum tipo de pendência.
 */
public class RelatorioPendencia {
    public static void main(String[] args) {
        String nome = "Isaque";
        String endereco = "Rua das Tulipas, 54 - Jardim Flórida, Barueri-SP";
        String telefone = "(11) 95423-4678";
        System.out.println("O " + nome + ", domiciliado no endereço " + endereco + " e telefone " + telefone + " não" +
                " possui nenhum tipo de pendência.");
    }
}
