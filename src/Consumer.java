public class Consumer implements Runnable{
    final Data data;

    public Consumer(Data data){
        this.data = data;
    }

    public void run(){
        for (int i = 0; i<50; i++) {
            synchronized (data){                                                //for mutual exclusion (mutex)
                data.value--;                                                   //Consumer decrease the value.
                System.out.println("Consumer's Data Value: " + data.value);
            }

        }
    }

}
