public class Main{

    public static void main(String[] args) throws InterruptedException, Exception {

        TimeCount timeCount = new TimeCount();

        ThreadOne thread1 = new ThreadOne(timeCount);
        thread1.run();

        ThreadTwo thread2 = new ThreadTwo (timeCount);
        thread2.run();

        ThreadThree thread3 = new ThreadThree (timeCount);
        thread3.run();


    }}








