package Threads;
class A implements Runnable{
    public void run(){
        for (int i=1;i<=4;i++)
        System.out.println("hi");
        try {
            Thread.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
class B extends Thread{
    public void run(){
    for (int i=1;i<=7;i++)
        System.out.println("hello" );
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
public class Demo {
    public static void main(String[] args) {
        Runnable a=new A();
        Runnable b=new B();
       // b.setPriority(Thread.MIN_PRIORITY);
        Thread t1=new Thread(a);
        Thread t2=new Thread(b);
        t1.start();
        t2.start();

    }
}
/*Threads:-
Multiple threads run at same time in a code.
This is known as Multithreading.

- A thread is a smallest unit to work with. (individual task)
- They can run parallely.
- Multiple threads can share resources.

*/