package pooj.rev;
/**
 * FIFO, first in first out
 *
 * Author: RAFMo
 */
public class Fila {
    private int primeiro;
    private int ultimo;
    private int[] dados;
    private final int capacidade;

    public Fila(int capacidade) {
        this.capacidade = capacidade;
        dados = new int[capacidade];
        primeiro = 0;
        ultimo = 0;
    }

    public boolean filaCheia() {
        return (ultimo + 1) % capacidade == primeiro;
    }

    public boolean filaVazia() {
        return primeiro == ultimo;
    }

    public void inserir(int e) {
        if (filaCheia()) {
            System.out.println("Fila cheia, nao pode inserir...");
        } else {
            dados[ultimo] = e;
            ultimo = (ultimo + 1) % capacidade; // cap p tamanho
        }
    }

    public int remove() {
        if (filaVazia()) {
            System.out.println("Fila vazia, nao pode retirar...");
            return -1;
        } else {
            int elemento = dados[primeiro];
            primeiro = (primeiro + 1) % capacidade; 
            return elemento;
        }
    }

    public void imprimir() {
        if (filaVazia()) {
            System.out.println("Fila vazia");
        } else {
            System.out.println("Elementos na fila:");
            int i = primeiro;
            while (i != ultimo) {
                System.out.println(dados[i]);
                i = (i + 1) % capacidade;
            }
        }
    }

    public static void main(String[] args) {
        Fila fila = new Fila(5);
        fila.inserir(1);
        fila.inserir(2);
        fila.inserir(3);
        fila.remove();
        fila.inserir(4);
        fila.inserir(5);
        fila.inserir(6);
        fila.imprimir();
    }
}
