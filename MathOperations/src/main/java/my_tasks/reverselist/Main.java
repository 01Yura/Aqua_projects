package my_tasks.reverselist;

public class Main {
    public static void main(String[] args) {
        Node node3 = new Node("C", null);
        Node node2 = new Node("B", node3);
        Node node1 = new Node("A", node2);

        node1.print();
        node2.print();
        node3.print();

        System.out.println("----------");
        reverseList(node1);

        node1.print();
        node2.print();
        node3.print();
    }

    public static Node reverseList(Node head) {

        Node next = null;
        Node prev = null;
        Node current = head;
        while (current != null) {
            next = current.getNext(); // сохраняем ссылку на следующую ноду
            current.setNext(prev);    // меняем ссылку next на предыдущую (у первой итерации она null)
            prev = current;           // делаем предыдущую ноду равной текущей, чтобы использовать в след итерации
            current = next;           // меняем текущую ноду на следующую, ссылку на которую мы сохранили на 1м шаге
        }
        return prev;
    }
}
