package my_tasks.reverselist;

public class Node {
    String value;
    Node next;

    public Node(String value, Node next) {
        this.value = value;
        this.next = next;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value='" + value + '\'' +
                ", next=" + next +
                '}';
    }

    public void print() {
        System.out.println("value: " + value);
        if (next == null) {
            System.out.println("next: " + null);
        } else {
            System.out.println("next: " + next);
        }
    }
}
