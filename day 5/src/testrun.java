class TestCallRun extends Thread{
@Override
public void run() {
        for(int i=0;i<5;i++){
        try {
        Thread.sleep(500);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        System.out.println(i);
        }

        System.out.println("running thread name is "+ Thread.currentThread().getName());
        System.out.println("running thread priority is "+ Thread.currentThread().getPriority());

        }
        }

public class testrun {
    public static void main(String[] args) {
        TestCallRun t1 = new TestCallRun();
        TestCallRun t2 = new TestCallRun();

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();

        t1.run();
        t2.run();

        t1.setName("New name t1");
        t2.setName("New name t2");

        System.out.println("After changing name of t1: "+ t1.getName());
        System.out.println("After changing name of t2: "+ t2.getName());
    }
}