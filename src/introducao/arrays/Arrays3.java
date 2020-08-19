package introducao.arrays;

public class Arrays3 {
    public static void main (String[] args){
        // 3 formas de declarar os arrays:
        int[] numeros = new int[5];
        int[] numeros2 = {1,2,3,4,5};//tamanho é 5, mas o índice vai de 0 a 4.
        int[] numeros3 = new int[]{1,2,3,4,5};

        //for(int i = 0;i < numeros2.length;i++){
        //    System.out.println(numeros2[i]);
        //}

        for(int num : numeros2){
            System.out.println(num);
        }
    }
}
