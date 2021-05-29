package LinkedList;


import java.util.logging.Logger;

public class LinkedListMain {

    private static final Logger logger = Logger.getLogger(LinkedListMain.class.getName());

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.add(new LinkedList.Node("1"));
        linkedList.add(new LinkedList.Node("2"));
        linkedList.add(new LinkedList.Node("3"));
        linkedList.add(new LinkedList.Node("4"));
        linkedList.add(new LinkedList.Node("5"));

        logger.info(linkedList.toString());

        logger.info(String.valueOf(linkedList.getMiddle()));

    }
}
