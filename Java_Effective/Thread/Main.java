package Java_Effective.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(6);

        for (int i = 0; i <10; i++){
            Runnable runnable = new Runnable() {

                @Override
                public void run() {
                    ThreadPoolExecutor threadPoolExecutor  = (ThreadPoolExecutor) executorService;

                    int poolSize = threadPoolExecutor.getPoolSize();

                    String threadName = Thread.currentThread(). getName();
                    System.out.println("스레드풀 갯수:" + poolSize + "스레드 이름; "+ threadName);
                }
            };

            executorService.execute(runnable);

            try{
                Thread.sleep(10);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        executorService.shutdown();
    }
}
