private final Lock lock = new ReentrantLock();
 
public void doSomething() {
  lock.lock();
  try {
    // ...
  } finally {
    lock.unlock();
  }
}
