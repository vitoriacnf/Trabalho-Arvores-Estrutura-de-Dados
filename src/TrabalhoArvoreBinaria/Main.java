package TrabalhoArvoreBinaria;

public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();
        arvore.inserir(10);
        arvore.inserir(5);
        arvore.inserir(15);
        arvore.inserir(3);
        arvore.inserir(7);

        System.out.println("Árvore em ordem:");
        arvore.imprimirEmOrdem();

        System.out.println("\nBusca:");
        System.out.println("Valor 5 encontrado: " + arvore.buscar(5));
        System.out.println("Valor 8 encontrado: " + arvore.buscar(8));
    }
}
