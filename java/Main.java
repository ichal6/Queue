public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue("Jeden", 0);
        queue.enqueue("Dwa", 0);
        queue.enqueue("Trzy", 0);
        queue.enqueue("Cztery");
        queue.enqueue("Pięć");

        for (String value = queue.dequeue(); value != null; value = queue.dequeue()) {
            System.out.println(value);
        }

        System.out.println("-----------");

        queue.enqueue("Jeden");
        queue.enqueue("Dwa");
        queue.enqueue("Trzy");

        for (String value = queue.dequeue(); value != null; value = queue.dequeue()) {
            System.out.println(value);
        }



    }
}
