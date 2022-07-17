public class Main {

    public static void main(String[] args) throws InterruptedException, Exception {

        TimeCount timeCount = new TimeCount();

        ThreadOne thread1 = new ThreadOne(timeCount);
        ThreadTwo thread2 = new ThreadTwo(timeCount);

        thread1.start();
        thread2.start();

    }
}








