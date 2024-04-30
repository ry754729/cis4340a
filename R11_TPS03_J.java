final class PoolService {
  // The values have been hard-coded for brevity
  ExecutorService pool = new CustomThreadPoolExecutor(
      10, 10, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(10));
  // ...
}
 
class CustomThreadPoolExecutor extends ThreadPoolExecutor {
  // ... Constructor ...
  public CustomThreadPoolExecutor(
      int corePoolSize, int maximumPoolSize, long keepAliveTime,
      TimeUnit unit, BlockingQueue<Runnable> workQueue) {
    super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue);
  }
 
 
  @Override
  public void afterExecute(Runnable r, Throwable t) {
    super.afterExecute(r, t);
    if (t != null) {
      // Exception occurred, forward to handler
    }
    // ... Perform task-specific cleanup actions
  }
 
  @Override
  public void terminated() {
    super.terminated();
    // ... Perform final clean-up actions
  }
}
