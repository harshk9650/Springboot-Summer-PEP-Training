package MultiThreading;

class Ithread implements Runnable{
    @Override
    public void run(){
        System.out.println("thred is started ");
    }
}
public class MultiThredByInterface {
    static void main(String[] args) {
        Ithread ithread = new Ithread();
        Thread th = new Thread(ithread);
        System.out.println("this is the method of thread name "+th.getName());
        System.out.println("this is the before start method "+th.isAlive());
        System.out.println("this is the State thread "+th.getState());
        System.out.println("this is the priorty "+th.getPriority());

        th.start();
        th.run();
        System.out.println("this is the afte start method "+th.isAlive());
        System.out.println("this is the afte start method "+th.isAlive());
    }
}
