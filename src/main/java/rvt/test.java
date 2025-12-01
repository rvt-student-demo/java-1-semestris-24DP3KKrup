package rvt;

class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void run() {
        System.out.println("Animal " + name + " is running");
    }

    public static void main(String[] args) {
        Animal a1 = new Animal("Leo", 4);
        Animal a2 = new Animal("Mia", 2);

        a1.run();
        a2.run();
        }
}