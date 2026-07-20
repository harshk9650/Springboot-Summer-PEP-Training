package MultiThreading;
class Pri extends Thread{
    public void run(){
        System.out.println("Here is the tas ");
        System.out.println(Thread.currentThread().getPriority());
    }
}
public class Priorty {
    static void main(String[] args) {

        System.out.println(Thread.currentThread().getPriority());
        Pri pri = new Pri();
        pri.setPriority(10);
        System.out.println("THis is the get priorty "+pri.getPriority());
        pri.start();
        Pri pri1 = new Pri();
        pri.setPriority(9);
        System.out.println("THis is the get priorty "+pri1.getPriority());
        pri1.start();
        Pri pri2 = new Pri();
        pri.setPriority(Thread.MIN_PRIORITY);
        System.out.println("THis is the get priorty "+pri2.getPriority());

        pri2.start();


    }
}
