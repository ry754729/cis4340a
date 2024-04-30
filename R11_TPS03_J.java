final class PoolService {
    private final ExecutorService pool = Executors.newFixedThreadPool(10);
   
    public void doSomething() {
      pool.execute(new Task());
    }
  }
   
  final class Task implements Runnable {
    @Override public void run() {
      // ...
      throw new NullPointerException();
      // ...
    }
  }