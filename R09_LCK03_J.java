private final Lock lock = new ReentrantLock();
 
public void doSomething() {
  synchronized(lock) {
    // ...
  }
}