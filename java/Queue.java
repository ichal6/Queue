import java.util.NoSuchElementException;

public class Queue {
    public class Node {
        private String value;
        private Node nextNode;
        private int priority;

        public Node(String value){
            this.value = value;
            this.priority = 0;
        }

        public Node(String value, int priority){
            this.value = value;
            this.priority = priority;
        }

        public String getValue(){
            return this.value;
        }

        public Node getNextNode(){
            return this.nextNode;
        }

        public void setNextNode(Node node) {
            this.nextNode = node;
        }

        public int getPriority() {
            return priority;
        }

        public void setPriority(int priority) {
            this.priority = priority;
        }
    }

    private Node head = null;
    private Node tail = null;
    private int size = 0;

    public void enqueue(String value){
        size++;
        if(head == null){
            head = new Node(value);
            tail = head;
            return;
        }

        Node oldTail = tail;
        tail = new Node(value);
        tail.setNextNode(oldTail);
    }

    public String peek(){
        if(head == null){
            throw new NoSuchElementException();
        }
        return head.getValue();
    }

    public String dequeue(){
        if(head == null){
            throw new NoSuchElementException();
        }
        size--;
        String value = head.getValue();

        if(tail == head){
            tail = null;
            head = null;
            return value;
        }
        Node newHead = tail;

        while (newHead != null){
            if(newHead.getNextNode() == head){
                head = newHead;
                head.setNextNode(null);
                break;
            }
            newHead = newHead.getNextNode();
        }
        return value;
    }

    public void enqueue (String value, int priority){
        size++;
        if(head == null){
            head = new Node(value, priority);
            tail = head;
            return;
        }

        Node beforeNode = tail;
        Node newNode = new Node(value, priority);

        while (beforeNode != null){
            if(beforeNode.getNextNode() == null || beforeNode.getNextNode().getPriority() <= priority){
                Node nextNode = beforeNode.getNextNode();
                beforeNode.setNextNode(newNode);
                newNode.setNextNode(nextNode);
                return;
            }
            beforeNode = beforeNode.getNextNode();
        }

        Node oldTail = tail;
        tail = newNode;
        tail.setNextNode(oldTail);
    }

    public int queueSize(){
        return this.size;
    }
    public boolean isEmpty(){
        return this.size <= 0;
    }
}
