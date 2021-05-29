package LinkedList;

public class LinkedList {
    Node head;
    Node tail;

    LinkedList() {
        head = new Node("head");
        tail = head;
    }

    public Node getHead() {
        return head;
    }

    public void add(Node node) {
        tail.nextNode = node;
        tail = node;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        Node pointer = head;
        while (pointer.nextNode != null) {
            pointer = pointer.nextNode;
            stringBuffer.append(pointer + " ");
        }
        return stringBuffer.toString();
    }

    public Node getMiddle() {

        Node middleNode = head;
        Node fastNode = head;
        int length = 0;

        while (fastNode.getNext() != null) {
            length++;
            fastNode = fastNode.getNext();

            if(length%2 == 0){
                middleNode = middleNode.getNext();
            }
        }

        if(length%2 ==1)
            middleNode = middleNode.getNext();

        return middleNode;
    }

    public static class Node {
        private Node nextNode;
        private String data;

        Node(String data) {
            this.data = data;
            nextNode = null;
        }
        public void setNext(Node node) {
            this.nextNode = node;
        }

        public String getData() {
            return data;
        }

        public Node getNext() {
            return nextNode;
        }

        public String toString() {
            return (this.data);
        }
    }
}
