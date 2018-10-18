public class Main {
    
    public static void main(String[] args) throws Exception {

        // Using  class Thread for creating new thread
        MyThread myThread = new MyThread();

        // Using interface Runnable for creating new thread
        MyRunnable MyRunnable = new MyRunnable();
        Thread thread = new Thread(MyRunnable);

        StartThread startThread = new StartThread();
        FinishThread finishThread = new FinishThread();

        // setPriority - showing for scheduler what to do first and what priority in the thread
        startThread.setPriority(Thread.MAX_PRIORITY);
        startThread.start();

        //join - showing that you must complete this thread before starting new thread
        myThread.join();
        myThread.start();

        //sleep - stops thread for 3 seconds
        try{
            Thread.sleep(3000);
            thread.start();
        }catch (Exception ex){
            ex.printStackTrace();
        }

        // yield - showing for scheduler that he can go to another thread
        Thread.yield();
        finishThread.start();
    }

    static class StartThread extends Thread {

        @Override
        public void run() {
            System.out.println("Start");
        }
    }

    static class MyThread extends Thread {

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
        }
    }

    static class MyRunnable implements Runnable {

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
        }
    }

    static class FinishThread extends Thread {

        @Override
        public void run() {
            System.out.println("Finish");
        }
    }
}

