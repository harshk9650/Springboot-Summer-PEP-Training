package MultiThreading;

public class MethodThread {
    static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("Harsh");
        System.out.println(10/0);
//        System.out.println(Thread.currentThread().getName());

    }
}
