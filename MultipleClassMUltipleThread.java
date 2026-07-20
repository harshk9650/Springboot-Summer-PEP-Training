package MultiThreading;
class AA extends Thread{
    AA(String name){
        super(name);

    }
    @Override
    public void run() {
        System.out.println("Task one "+getName());
    }
}
class BB extends Thread{
    BB(String name){
        super(name);

    }
    @Override
    public void run() {
        System.out.println("Task one "+getName());
    }
}

public class MultipleClassMUltipleThread {
    static void main(String[] args) {
      AA aa = new AA("Worker");
      aa.start();
      BB bb = new BB("Helper");
      bb.start();
      SingleTask singleTask2 = new SingleTask();
      singleTask2.start();
      Ithread ithread4 = new Ithread();
      Thread threadd = new Thread(ithread4);
      threadd.start();
    }
}
