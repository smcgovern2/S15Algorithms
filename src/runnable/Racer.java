package runnable;

public class Racer implements Runnable {
    public void run() {
        try {
            System.out.println ("Thread " +
                    Thread.currentThread().getId() + " is running");
            for (int i=0;i<3;i++) {
                System.out.println(Thread.currentThread().getId() +
                        " Thread - Time " + i);
            }
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println ("Exception is caught");
        }
    }

    public void start(){
        this.run();
    }
}

