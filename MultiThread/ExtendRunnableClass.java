package MultiThread;

public class ExtendRunnableClass implements Runnable {
    public void run() {
        System.out.println("New thread starts!");
    }
    public static void main(String[] args) {
        ExtendRunnableClass extendRunnableClass = new ExtendRunnableClass();
        Thread thread = new Thread(extendRunnableClass);
        thread.start();
    }
}
