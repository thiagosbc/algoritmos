package buscabinaria;
public class PesquisaBinaria {

    public static void pesquisa_binaria(int[] array, int valor) {

        int inicio = 0;
        int fim = array.length - 1;

        while (inicio <= fim) {

            int meio = (inicio + fim) / 2;

            if (array[meio] == valor) {
                System.out.println("Valor encontrado na índice: " + meio);
                return;
            }

            if (array[meio] < valor) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        System.out.println("O valor não está na lista.");
    }
}
