package threads;

public class Main {
    public static void main(String[] args) {
        int n = 2; // Number of threads
        for (int i=0; i<2; i++)
        {
            Racer object = new Racer();
            object.start();
        }
    }
}
