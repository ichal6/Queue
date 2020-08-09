import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue("Jeden");
        queue.enqueue("Dwa");
        queue.enqueue("Trzy");
        queue.enqueue("Cztery");
        queue.enqueue("Pięć");

        for (String value = queue.dequeue(); value != null; ) {
            System.out.println(value);
            try{
                value = queue.dequeue();
            } catch (NoSuchElementException ex){
                break;
            }
        }

        System.out.println("-----------");

        queue.enqueue("Jeden");
        queue.enqueue("Dwa");
        queue.enqueue("Trzy");

        for (String value = queue.dequeue(); value != null; ) {
            System.out.println(value);
            try{
                value = queue.dequeue();
            } catch (NoSuchElementException ex){
                break;
            }
        }



    }
}
