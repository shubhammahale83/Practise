package MultiThread;

public class ExtendThreadClass extends Thread {
    public void run() {
         System.out.println("Thread is running using Thread class");
    }

    public static void main(String[] args) {
        ExtendThreadClass thread1 = new ExtendThreadClass();
        thread1.start();
    }
}
