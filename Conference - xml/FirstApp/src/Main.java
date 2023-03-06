

public class Main {
    public static void main(String[] args) {
      Runnable runnable=()->{
        System.out.println("Running"+Thread.currentThread().getName());
      };
      Thread t = new Thread(runnable);
      t.setName(" runnable thread");
      t.start();
      //t.run();
    }
}
