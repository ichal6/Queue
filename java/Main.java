import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue("Jeden", 2);
        queue.enqueue("Dwa", 3);
        queue.enqueue("Trzy", 1);
        queue.enqueue("Cztery", -1);
        queue.enqueue("Pięć", 2);

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
