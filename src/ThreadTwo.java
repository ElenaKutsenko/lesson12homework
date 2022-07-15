import java.sql.Time;

public class ThreadTwo implements Runnable {
    TimeCount timeCount;
    ThreadTwo(TimeCount timeCount) {
        this.timeCount = timeCount;
    }

    int i;

    @Override
    public void run() {
        for (int i = 1; i < 1000; i++) {

            try {
                timeCount.stop5sec();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Text");
        }
    }
}





