package org.exemple.datastructures;

public class Edge {
    int to;
    int weight;
    Edge next;

    public Edge(int to, int weight) {
        this.to = to;
        this.weight = weight;
        this.next = null;
    }
}
