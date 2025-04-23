package org.exemple.datastructures;

public class Graph {
    private final int vertices;
    private final EdgeList[] adjacencyList;

    public Graph(int vertices) {
        this.vertices = vertices;
        adjacencyList = new EdgeList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new EdgeList();
        }
    }

    // Adiciona uma aresta ao grafo direcionado
    public void addEdge(int from, int to, int weight) {
        adjacencyList[from].add(to, weight);
    }

    // Executa o algoritmo de Dijkstra a partir do vértice de origem
    public void dijkstra(int start) {
        boolean[] visited = new boolean[vertices];
        int[] distance = new int[vertices];

        for (int i = 0; i < vertices; i++) {
            distance[i] = Integer.MAX_VALUE;
        }
        distance[start] = 0;

        for (int i = 0; i < vertices; i++) {
            int u = getMinDistanceVertex(distance, visited);
            if (u == -1) break;
            visited[u] = true;

            Edge current = adjacencyList[u].iterator();
            while (current != null) {
                if (!visited[current.to] && distance[u] != Integer.MAX_VALUE &&
                        distance[u] + current.weight < distance[current.to]) {
                    distance[current.to] = distance[u] + current.weight;
                }
                current = current.next;
            }
        }

        printDistances(distance);
    }

    // Retorna o índice do vértice com a menor distância ainda não visitado
    public int getMinDistanceVertex(int[] distance, boolean[] visited) {
        int min = Integer.MAX_VALUE, minIndex = -1;
        for (int v = 0; v < vertices; v++) {
            if (!visited[v] && distance[v] < min) {
                min = distance[v];
                minIndex = v;
            }
        }
        return minIndex;
    }

    // Imprime as menores distâncias do vértice de origem até os demais
    public void printDistances(int[] distance) {
        System.out.println("Vértice\tDistância da origem");
        for (int i = 0; i < vertices; i++) {
            String dist = (distance[i] == Integer.MAX_VALUE) ? "Infinito" : String.valueOf(distance[i]);
            System.out.println(i + "\t\t" + dist);
        }
    }
}
