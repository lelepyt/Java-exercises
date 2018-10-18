public class VolatileMain {

    //if you deleted "volatile" method MyThreadRead will stop working
    volatile static int i = 0;

    public static void main (String [] args) {
        new MyThreadRead().start();
        new MyThreadWrite().start();
    }

    static class MyThreadWrite extends Thread {

        @Override
        public void run() {
            while (i < 5) {
                System.out.println("i = " + (i++));

                try {
                    Thread.sleep(1000);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    static class MyThreadRead extends Thread {

        @Override
        public void run() {
            int localI = i;
            while (localI < 5 ) {
                if (localI != i) {
                    System.out.println("New i = " + i);
                    localI = i;
                }
            }
        }
    }
}
