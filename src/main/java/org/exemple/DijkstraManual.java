package org.exemple;

import org.exemple.datastructures.Graph;

public class DijkstraManual {
    public static void main(String[] args) {
        Graph graph = new Graph(5);

        // Definição das arestas do grafo
        graph.addEdge(0, 1, 10);
        graph.addEdge(0, 4, 5);
        graph.addEdge(1, 2, 1);
        graph.addEdge(1, 4, 2);
        graph.addEdge(2, 3, 4);
        graph.addEdge(3, 0, 7);
        graph.addEdge(3, 2, 6);
        graph.addEdge(4, 1, 3);
        graph.addEdge(4, 2, 9);
        graph.addEdge(4, 3, 2);

        // Executa o algoritmo a partir do vértice 0
        graph.dijkstra(0);
    }
}