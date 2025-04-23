package org.exemple.datastructures;

public class Node {
    int id;
    int distance;
    Node next;

    public Node(int id, int distance) {
        this.id = id;
        this.distance = distance;
        this.next = null;
    }
}
