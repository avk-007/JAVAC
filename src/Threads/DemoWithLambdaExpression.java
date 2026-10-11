package Threads;
/*class Aca implements Runnable{
    public void run(){
        for (int i=1;i<=4;i++)
            System.out.println("hi");
        try {
            Thread.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}*/
//no use for below demo main
class Bca implements Runnable{
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
public class DemoWithLambdaExpression {
    public static void main(String[] args) {
        //converted to lambda expression
/*        Runnable a=new Runnable() {
            public void run(){
                for (int i=1;i<=4;i++)
                    System.out.println("hi");
                try {
                    Thread.sleep(3);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };*/

        //directly written with runnable with LE
         Runnable a=()-> {
             for (int i = 1; i <= 4; i++)
                 System.out.println("hi");
             try {
                 Thread.sleep(3);
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }
         };
   //     Runnable b=new B();
        Runnable b=()-> {
            for (int i = 1; i <= 4; i++)
                System.out.println("hello");
            try {
                Thread.sleep(3);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        // b.setPriority(Thread.MIN_PRIORITY);
        Thread t1=new Thread(a);
        Thread t2=new Thread(b);
        t1.start();
        t2.start();
    }
}

