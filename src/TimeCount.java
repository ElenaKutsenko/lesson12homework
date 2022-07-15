public class TimeCount {

    private int i;
    public synchronized void start() throws InterruptedException {
        while (i % 5 == 0 && i % 7 == 0) {
            wait();
        }
        notifyAll();
    }

    public synchronized void stop5sec() throws InterruptedException {
        while (i % 5 != 0) {
            wait();
        }
        notifyAll();
    }

    public void stop7sec() throws InterruptedException {
        while (i % 7 != 0) {
            wait();
        }
        notifyAll();
    }
}

