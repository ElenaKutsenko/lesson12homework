class ThreadOne extends Thread {
    TimeCount timeCount;

    public ThreadOne(TimeCount timeCount) {
        this.timeCount = timeCount;
    }

    int i;

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException ex) {
               Thread.currentThread().interrupted();
            }
                this.timeCount.add();
        }
    }
}


