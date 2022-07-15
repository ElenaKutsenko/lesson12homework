public class ThreadThree implements Runnable {
    TimeCount timeCount;
    ThreadThree (TimeCount timeCount) {
        this.timeCount = timeCount;
    }
    @Override
    public void run() {
        for (int i = 1; i < 1000; i++) {
            try {
                timeCount.stop7sec();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Next Text");
        }

    }
}

