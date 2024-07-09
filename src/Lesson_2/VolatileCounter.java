package Lesson_2;

public class VolatileCounter {
    private volatile int sum = 0;

    public void counter() {
        setSum(getSum() + 1);
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}