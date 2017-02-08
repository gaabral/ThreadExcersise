/**
 * Created by Gaba on 2017-02-08.
 */
public class MainApp {

    public static void main(String[] args){

        Thread threadOne = new GetTime();
        Runnable threadTwo = new GetMail(10);
        Runnable threadThree = new GetMail(15);

        threadOne.start();
        new Thread(threadTwo).start();
        new Thread(threadThree).start();

    }
}
