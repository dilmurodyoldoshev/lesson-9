package Lesson_2;

public class LockCounter {
    private int sum = 0;
    private final Object lock = new Object();

    public void counter() {
        synchronized (lock) {
            setSum(getSum() + 1);
        }
    }

    public int getSum() {
        synchronized (lock) {
            return sum;
        }
    }

    public void setSum(int sum) {
        synchronized (lock) {
            this.sum = sum;
        }
    }
}