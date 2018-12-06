package runnable;

public class Main {
    public static void main(String[] args) {
        int n = 4; // Number of threads
        for (int i=0; i<4; i++)
        {
            Thread object = new Thread(new MultithreadingDemo());
            object.start();
        }
    }
}
