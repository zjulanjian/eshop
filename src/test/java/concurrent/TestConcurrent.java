package concurrent;

import org.junit.Test;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class TestConcurrent implements Runnable {
    final AtomicInteger number = new AtomicInteger();
    volatile boolean bol = false;

    @Override
    public void run() {
        System.out.println(number.getAndIncrement());
        synchronized (this) {
            try {
                if(!bol) {
                    System.out.println(bol);
                    bol = true;
                    Thread.sleep(10000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("并发的数量为: " + number.intValue());
        }
    }

    public static void main(String[] args) {
        ExecutorService pool = Executors.newCachedThreadPool();
        TestConcurrent test = new TestConcurrent();
        for(int i=0; i < 1000; i++) {
            pool.execute(test);
        }
    }
}
