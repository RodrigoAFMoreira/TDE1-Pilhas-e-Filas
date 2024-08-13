package pooj.rev;
/**
 * LIFO, last in first out
 *
 * Author: RAFMo
 */
public class Pilha {
    private int topo;
    private int[] dados;
    private final int capacidade;

    public Pilha(int capacidade) {
        this.capacidade = capacidade;
        this.dados = new int[capacidade];
        this.topo = -1; // Inicializar com -1 pilha vazia
    }

    public boolean pilhaCheia() {
        return topo == capacidade - 1;
    }

    public boolean pilhaVazia() {
        return topo == -1;
    }
    
    public int insere(int elemento) {
        if (!this.pilhaCheia()) {
            topo = topo + 1;
            this.dados[topo] = elemento;
            return topo;
        } else {
            System.out.println("Nao podemos mais empilhar...");
            return -1;
        }
    }

    public int remove() {
        if (!this.pilhaVazia()) {
            int valorTopo = dados[topo];
            topo = topo - 1;
            System.out.println("O valor desempilhado foi..." + valorTopo);
            return valorTopo;
        } else {
            System.out.println("A pilha esta vazia.");
            return -1;
        }
    }
    
    public void mostrarTodos() {
        if (!this.pilhaVazia()) {
            System.out.println("Elementos na pilha:");
            for (int i = 0; i <= topo; i++) {
                System.out.println(dados[i]);
            }
        } else {
            System.out.println("A pilha esta vazia.");
        }
    }

    public static void main(String[] args) {
        
        Pilha p = new Pilha(5);

        p.insere(1);
        p.insere(2);
        p.insere(3);
        p.insere(4);
        p.remove();
        p.insere(5);
        p.insere(6);
        p.remove();
        p.insere(7);
        //p.insere(8);
        p.mostrarTodos(); 
    }
}
