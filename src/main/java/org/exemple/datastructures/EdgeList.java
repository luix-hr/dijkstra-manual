package org.exemple.datastructures;

public class EdgeList {
    Edge head;

    // Adiciona uma aresta ao final da lista
    public void add(int to, int weight) {
        Edge newEdge = new Edge(to, weight);
        if (head == null) {
            head = newEdge;
        } else {
            Edge current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newEdge;
        }
    }

    // Retorna o início da lista de arestas
    public Edge iterator() {
        return head;
    }
}
