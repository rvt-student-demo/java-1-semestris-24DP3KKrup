package rvt;

public class Overloaded_Counter {
    private int value;

    public static void main(String[] args) {
        Overloaded_Counter counter = new Overloaded_Counter(10);
        counter.increase();
        counter.increase(5);
        counter.decrease();
        counter.decrease(3);
        System.out.println("Counter value: " + counter.value());
    }

    public Overloaded_Counter(int startValue) {
        this.value = startValue;
    }

    public Overloaded_Counter() {
        this(0);
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        this.value++;
    }

    public void decrease() {
        this.value--;
    }

    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            this.value += increaseBy;
        }
    }

    public void decrease(int decreaseBy) {
        if (decreaseBy > 0) {
            this.value -= decreaseBy;
        }
    }
}
