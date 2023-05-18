package TrabalhoArvoreBinaria;

class ArvoreBinaria {
    No raiz;

    public ArvoreBinaria() {
        raiz = null;
    }

    public void inserir(int valor) {
        raiz = inserirRecursivamente(raiz, valor);
    }

    private No inserirRecursivamente(No no, int valor) {
        if (no == null) {
            return new No(valor);
        }

        if (valor < no.valor) {
            no.esquerda = inserirRecursivamente(no.esquerda, valor);
        } else if (valor > no.valor) {
            no.direita = inserirRecursivamente(no.direita, valor);
        }

        return no;
    }

    public boolean buscar(int valor) {
        return buscarRecursivamente(raiz, valor);
    }

    private boolean buscarRecursivamente(No no, int valor) {
        if (no == null) {
            return false;
        }

        if (valor == no.valor) {
            return true;
        }

        if (valor < no.valor) {
            return buscarRecursivamente(no.esquerda, valor);
        } else {
            return buscarRecursivamente(no.direita, valor);
        }
    }

    public void imprimirEmOrdem() {
        imprimirEmOrdemRecursivamente(raiz);
    }

    private void imprimirEmOrdemRecursivamente(No no) {
        if (no != null) {
            imprimirEmOrdemRecursivamente(no.esquerda);
            System.out.print(no.valor + " ");
            imprimirEmOrdemRecursivamente(no.direita);
        }
    }
}

