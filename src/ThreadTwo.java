import java.sql.Time;

public class ThreadTwo extends Thread {
    TimeCount timeCount;

    ThreadTwo(TimeCount timeCount) {

        this.timeCount = timeCount;
    }

    int i;

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            int n;
            try {
                n = timeCount.last();
                System.out.println(n);
                if (n % 5 == 0) {
                    System.out.println(n + "Text");
                }
                if (n % 7 == 0) {
                    System.out.println(n + "Text");
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}






