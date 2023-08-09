public class testThreads {
    public static void main(String[] args) {

        Data data = new Data();
        data.value = 100;

        Producer producer = new Producer(data);

        Consumer consumer = new Consumer(data);      //Here consumer is not a thread.
        Thread threadC = new Thread(consumer);       //With this line, it will work like a thread.

        producer.start();
        threadC.start();

    }
}