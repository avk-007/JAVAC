package PracticeX2026;
//threads

//class A extends Thread {
class A implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i < 4; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(3);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class B extends  Thread{
    @Override
    public void run() {
        for(int i=1;i<=7;i++){
            System.out.println("hello");
            try {
                Thread.sleep(10);
            }
            catch (InterruptedException e){
                throw  new RuntimeException(e);
            }
        }
    }
}

public class Demo {
    public static void main(String[] args) {
/*//The constructor accepts a Runnable object
    and uses its run() method when the thread starts.
    */
        Runnable r1 = new A();
        Runnable r2 = new B();

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
    /*   only works with  when class A or B extends  Thread
     int priority = t1.getPriority();
        System.out.println(priority);*/
        //methods
        t1.start();
        t2.start();


//*IMP*  priority
        //least priority 1
        //high priority 10\
        //default is 5
    }
}



