package leetcode;

import java.util.concurrent.Semaphore;

class building_h2o {
    private Semaphore oxy = new Semaphore(0); // allow 0 oxygen go through at beginning
    private Semaphore hyd = new Semaphore(2); // allow 2 hydrogen go through
    public building_h2o() {

    }

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
        hyd.acquire();  // permits - 1;
        // releaseHydrogen.run() outputs "H". Do not change or remove this line.
        releaseHydrogen.run();
        oxy.release();  // now we have 2 H and we need 1 O and every time release one permit for oxygen

    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {
        oxy.acquire(2);  // get two permits one time
        // releaseOxygen.run() outputs "O". Do not change or remove this line.
        releaseOxygen.run();
        hyd.release(2);
    }
}
