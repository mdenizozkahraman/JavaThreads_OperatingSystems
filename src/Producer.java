public class Producer extends Thread{
    final Data data;

    public Producer(Data data){
        this.data = data;
    }

    public void run(){
        for (int i = 0; i<10; i++) {
            synchronized (data) {                                               //for mutual exclusion (mutex)
                data.value++;                                                   //Producer increase the value.
                System.out.println("Producer's Data Value: " + data.value);
            }

        }
    }
}
