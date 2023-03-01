public class Exercice2 {
    public static void execute() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Before Java 8, too much code for too little to do");
            }
        }).start();
    }
}
