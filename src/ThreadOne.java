class ThreadOne implements Runnable {
    TimeCount timeCount;

    public ThreadOne (TimeCount timeCount) {
        this.timeCount = timeCount;
    }
    int i;
    @Override
    public void run() {
            for (int i = 1; i < 1000; i++) {
                try {
                    Thread.sleep(1000L);
                    timeCount.start();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(i);
            }
    }
}


