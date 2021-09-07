class MultiThreadDemo extends Thread implements Runnable{
    @Override
    public void run() {
        System.out.println("thread is running...");
    }
}

class ThreadSleepDemo extends Thread{
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}

public class threadtime {
    public static void main(String[] args) {
        MultiThreadDemo threadDemo = new MultiThreadDemo();
        threadDemo.start();
        MultiThreadDemo t2 = new MultiThreadDemo();
        Thread tt = new Thread(t2);
        tt.start();

        ThreadSleepDemo ts = new ThreadSleepDemo();
        ts.start();
    }
}