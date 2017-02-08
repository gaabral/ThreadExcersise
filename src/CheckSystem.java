import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Gaba on 2017-02-08.
 */
public class CheckSystem implements Runnable {
    private String checkWhat;
    ReentrantLock lock = new ReentrantLock();

    public CheckSystem(String checkWhat){
        this.checkWhat = checkWhat;
    }

    @Override
    public void run() {
        lock.lock();

        System.out.println("Checking " + this.checkWhat);

        lock.unlock();
    }
}
