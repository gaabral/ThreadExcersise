import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import static java.util.concurrent.TimeUnit.*;

/**
 * Created by Gaba on 2017-02-08.
 */
public class MainApp {


    public static void main(String[] args){

        runThreads(false);

    }

    private static void runThreads(boolean isBasic){
        if(isBasic){
            AllThreads threads = new AllThreads();
            threads.runBasic();
            threads.checkThreadsProperties();

        }else{
            AllThreads scheduledThreads = new AllThreads();
            scheduledThreads.runWithScheduler();
            scheduledThreads.checkThreadsProperties();
        }
    }//END OF RUNTHREADS





}

