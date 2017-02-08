import java.util.concurrent.ScheduledThreadPoolExecutor;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Created by Gaba on 2017-02-08.
 */
public class AllThreads {

    private Thread threadOne = new GetTime();
    private Runnable threadTwo = new GetMail(10);
    private Runnable threadThree = new GetMail(15);
    private GetMail mailThread = new GetMail(1);
    private ScheduledThreadPoolExecutor myPool = new ScheduledThreadPoolExecutor(5);


    public void runBasic(){

        threadOne.start();
        new Thread(threadTwo).start();
        new Thread(threadThree).start();
        new Thread(mailThread).start();
    }

    public void runWithScheduler(){
        myPool.scheduleAtFixedRate(new GetSystemTime(), 0, 2, SECONDS);
        myPool.scheduleAtFixedRate(new CheckSystem("Mail"), 5,5,SECONDS);
        myPool.scheduleAtFixedRate(new CheckSystem("Calendar"), 10, 10, SECONDS);

    }

    public void checkThreadsProperties(){
        int threadCount = Thread.activeCount();
        Thread[] listOfThreads = new Thread[Thread.activeCount()];
        Thread.enumerate(listOfThreads); //fill above list with active threads

        System.out.println("Number of threads: " + threadCount);
        for(Thread t : listOfThreads){
            System.out.println("Thread named: " + t.getName() + " has priority: " + t.getPriority() );
        }

    }

}
