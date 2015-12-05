package ThreadsExample;


public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        //create thread
       // Thread thread = new Thread(new Counter());
//        thread.setDaemon(true);
//        thread.start();

        for (int i = 0; i<2; i++){
            //new Counter().start();

            Counter counter = new Counter();
            counter.setPriority(i * 9 + 1);
            counter.start();
        }

        Thread.sleep(5000);
        //thread.join();    // зависает поток, но котором вызван join();

        System.out.println("main-end");
    }
}

class Counter extends Thread {
    private int i = 0;
    public  void run(){
        for (int j = 0; j <7; j++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getId() + " " + i++);
        }
    }

}
