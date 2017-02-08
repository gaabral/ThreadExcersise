/**
 * Created by Gaba on 2017-02-08.
 */
public class GetMail implements Runnable {

    private int startTime;

    public GetMail(int startTime){
        this.startTime = startTime;
    }
    @Override
    public void run() {

        try{
            Thread.sleep(startTime*1000);
        }catch(InterruptedException e){
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        }

        System.out.println("Checking Mail");
        System.out.println();

    }
}
